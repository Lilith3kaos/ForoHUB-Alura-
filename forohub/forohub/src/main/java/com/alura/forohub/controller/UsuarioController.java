package com.alura.forohub.controller;


import com.alura.forohub.domain.curso.CursoRepository;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cursos")
@SecurityRequirement(name = "bearer-key")
public class UsuarioController {

    @Autowired
    private CursoRepository cursoRepository;
}
