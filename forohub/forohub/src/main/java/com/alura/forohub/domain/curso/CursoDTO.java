package com.alura.forohub.domain.curso;

public class CursoDTO {
    private Long id;
    private String nombre;

    // Constructor vacío necesario para que Jackson pueda deserializar JSON
    public CursoDTO() {
    }

    // Constructor con parámetros
    public CursoDTO(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
