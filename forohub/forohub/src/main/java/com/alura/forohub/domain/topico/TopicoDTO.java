package com.alura.forohub.domain.topico;

import com.alura.forohub.domain.curso.CursoDTO;


public class TopicoDTO {
    private Long id;
    private String nombre;
    private CursoDTO curso;

    // Constructor vacío necesario para que Jackson pueda deserializar JSON
    public TopicoDTO() {
    }

    // Constructor con parámetros
    public TopicoDTO(Long id, String nombre, CursoDTO curso) {
        this.id = id;
        this.nombre = nombre;
        this.curso = curso;
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

    public CursoDTO getCurso() {
        return curso;
    }

    public void setCurso(CursoDTO curso) {
        this.curso = curso;
    }
}
