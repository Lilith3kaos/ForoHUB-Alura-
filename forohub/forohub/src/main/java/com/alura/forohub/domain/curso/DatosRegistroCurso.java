package com.alura.forohub.domain.curso;

import com.alura.forohub.domain.topico.Categoria;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroCurso(
        String nombre,
        Categoria categoria
) {}
