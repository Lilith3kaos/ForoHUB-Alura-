package com.alura.forohub.controller;

import com.alura.forohub.domain.curso.*;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;


@RestController
@RequestMapping("/cursos")
@SecurityRequirement(name = "bearer-key")
@SuppressWarnings("all")

public class CursoController {

    @Autowired
    private CursoRepository cursoRepository;

    @PostMapping
    @Transactional
    public ResponseEntity registrarRespuesta(@RequestBody @Valid DatosRegistroCurso datos, UriComponentsBuilder uriBuilder) {
        var curso = new Curso(datos);
        cursoRepository.save(curso);

        var uri = uriBuilder.path("/cursos/{id}").buildAndExpand(curso.getId()).toUri();
        return ResponseEntity.created(uri).body(new DatosDetalleCurso(curso));
    }

    @GetMapping
    public ResponseEntity<Page<DatosListadoCurso>>listadoCurso(Pageable paginacion) {
        return ResponseEntity.ok(cursoRepository.findAll(paginacion).map(DatosListadoCurso::new));
    }
}
