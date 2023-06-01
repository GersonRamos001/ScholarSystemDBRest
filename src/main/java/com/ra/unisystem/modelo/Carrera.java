package com.ra.unisystem.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;

@Entity(name="carreras")
public class Carrera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_carrera")
    private Long id;
    private String nombre;

    @Column(name="id_facultad")
    private Long idfacultad;


    @OneToMany(mappedBy = "carrera")
    @JsonIgnore //this is to avoid circular reference jsonbackReference, jsonmanagereference
    private Set<Asignatura> asignaturas;


    //Constructor

    public Carrera() {}


    //Getter and setter


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

    public Set<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Set<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }


    @Override
    public String toString() {
        return "Carrera{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", idfacultad=" + idfacultad +
                ", asignaturas=" + asignaturas +
                '}';
    }
}
