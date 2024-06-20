package com.alura.forohub.domain.usuarios;

import jakarta.validation.constraints.NotBlank;

public record DatosAutenticacionUsuario(
        @NotBlank String nombre,
        @NotBlank String contrasena
) {}
