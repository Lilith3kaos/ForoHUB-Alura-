package com.alura.forohub.controller;

import com.alura.forohub.domain.respuesta.DatosRegistroRespuesta;
import com.alura.forohub.domain.respuesta.Respuesta;
import com.alura.forohub.domain.respuesta.RespuestaRepository;
import com.alura.forohub.domain.topico.Topico;
import com.alura.forohub.domain.topico.TopicoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/respuestas")
public class RespuestaController {

    private final RespuestaRepository respuestaRepository;
    private final TopicoRepository topicoRepository;

    @Autowired
    public RespuestaController(RespuestaRepository respuestaRepository, TopicoRepository topicoRepository) {
        this.respuestaRepository = respuestaRepository;
        this.topicoRepository = topicoRepository;
    }

    @PostMapping
    @Transactional
    public ResponseEntity<Respuesta> registrarRespuesta(
            @RequestBody @Valid DatosRegistroRespuesta datosRegistroRespuesta,
            UriComponentsBuilder uriComponentsBuilder) {

        Topico topico = topicoRepository.findById(datosRegistroRespuesta.topico_id())
                .orElseThrow(() -> new IllegalArgumentException("Tópico no encontrado"));

        Respuesta respuesta = new Respuesta(datosRegistroRespuesta, topico);
        respuesta = respuestaRepository.save(respuesta);

        var uri = uriComponentsBuilder.path("/respuestas/{id}").buildAndExpand(respuesta.getId()).toUri();
        return ResponseEntity.created(uri).body(respuesta);
    }
}
