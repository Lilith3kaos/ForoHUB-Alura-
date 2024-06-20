package com.alura.forohub.domain.curso;

import com.alura.forohub.domain.topico.Categoria;

public record DatosListadoCurso(Long id,
                                String nombre,
                                String categoria ) {
    public DatosListadoCurso(Curso curso){
        this(curso.getId(),
                curso.getNombre(),
                String.valueOf(curso.getCategoria()));
    }
}
