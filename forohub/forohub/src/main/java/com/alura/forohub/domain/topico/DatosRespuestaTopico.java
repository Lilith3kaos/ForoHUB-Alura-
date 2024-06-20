package com.alura.forohub.domain.topico;

import com.alura.forohub.domain.curso.DatosRegistroCurso;

import java.time.LocalDateTime;

public record DatosRespuestaTopico(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fecha_creacion,
        String autor,
        DatosRegistroCurso curso
) {}
