package com.alura.forohub.domain.respuesta;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record DatosRegistroRespuesta(
        @NotNull(message = "El mensaje no puede estar vacío")
        @Size(min = 20, max = 255, message = "El mensaje debe tener entre 20 y 255 caracteres")
        String mensaje,

        @NotNull(message = "El ID del tópico no puede estar vacío")
        Long topico_id,

        @NotNull(message = "El autor no puede estar vacío")
        String autor
) {}
