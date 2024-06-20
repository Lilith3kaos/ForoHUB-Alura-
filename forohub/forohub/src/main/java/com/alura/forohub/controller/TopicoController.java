package com.alura.forohub.controller;

import com.alura.forohub.domain.curso.CursoDTO;
import com.alura.forohub.domain.topico.*;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;


@SecurityRequirement(name = "bearer-key")
@RestController
@RequestMapping("/topicos")
public class TopicoController {

    private final TopicoRepository topicoRepository;

    public TopicoController(TopicoRepository topicoRepository) {
        this.topicoRepository = topicoRepository;
    }

    @PostMapping
    @Transactional
    public ResponseEntity<Topico> registrarTopico(
            @RequestBody @Valid DatosRegistroTopico datosRegistroTopico,
            UriComponentsBuilder uriComponentsBuilder) {

        Topico topico = new Topico(datosRegistroTopico);
        topico = topicoRepository.save(topico);

        var uri = uriComponentsBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
        return ResponseEntity.created(uri).body(topico);
    }

    @GetMapping
    public ResponseEntity<Page<DatosListadoTopico>> listarTopicos(@PageableDefault(size = 4) Pageable paginacion) {
        Page<Topico> topicos = topicoRepository.findByActivoTrue(paginacion);
        Page<DatosListadoTopico> datosListadoTopicos = topicos.map(this::convertirADatosListadoTopico);
        return ResponseEntity.ok(datosListadoTopicos);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<Void> eliminarTopico(@PathVariable Long id) {
        Topico topico = topicoRepository.getReferenceById(id);
        topico.desactivarTopico();
        return ResponseEntity.noContent().build();
    }

    private DatosListadoTopico convertirADatosListadoTopico(Topico topico) {
        return new DatosListadoTopico(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFechaCreacion().toString(),
                topico.getAutor(),
                topico.getCurso(),
                topico.getCurso().getCategoria()
        );
    }
    public Page<TopicoDTO> listar(Pageable pageable) {
        Page<Topico> topicos = topicoRepository.findAll(pageable);
        return topicos.map(this::convertToDTO);
    }

    private TopicoDTO convertToDTO(Topico topico) {
        CursoDTO cursoDTO = new CursoDTO(topico.getCurso().getId(), topico.getCurso().getNombre());
        return new TopicoDTO(topico.getId(), topico.getTitulo(), cursoDTO);
    }
}
