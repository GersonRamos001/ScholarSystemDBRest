package com.ra.unisystem.modelo;

import jakarta.persistence.*;

@Entity(name="carreras")
public class Carrera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nombre;

    @Column(name="id_facultad")
    private Long idfacultad;

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

    public Long getIdfacultad() {
        return idfacultad;
    }

    public void setIdfacultad(Long idfacultad) {
        this.idfacultad = idfacultad;
    }
}
