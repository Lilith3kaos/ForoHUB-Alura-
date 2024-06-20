package com.alura.forohub.domain.topico;

import com.alura.forohub.domain.curso.Curso;

public record DatosListadoTopico(
        Long id,
        String titulo,
        String mensaje,
        String fechaCreacion,
        String autor,
        Curso curso,
        Categoria categoria
) {}
