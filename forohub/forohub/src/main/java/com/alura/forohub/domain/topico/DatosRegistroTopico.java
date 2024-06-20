package com.alura.forohub.domain.topico;

import com.alura.forohub.domain.curso.Curso;
import com.alura.forohub.domain.respuesta.Respuesta;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
        @NotNull String titulo,
        @NotNull String mensaje,
        @NotNull String autor,
        @NotNull Curso curso,
        Respuesta respuesta
) {
    public Categoria getCategoria() {
        return curso.getCategoria();
    }
}
