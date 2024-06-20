package com.alura.forohub.domain.curso;

import com.alura.forohub.domain.topico.Categoria;

public record DatosDetalleCurso(String nombre, Categoria categoria) {
    public DatosDetalleCurso(Curso curso){
        this(curso.getNombre(), curso.getCategoria());

    }
}
