package com.ra.unisystem.modelo;

import jakarta.persistence.*;

@Entity(name="asignaturas")
public class Asignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_asignatura")
    private long id;

    private String nombre;

    private String descripcion;

    private int creditos;

    @ManyToOne
    @JoinColumn(name = "id_carrera")
    private Carrera carrera;

    //Constructor

    public Asignatura() {
    }


    //Getter and setter


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }



}
