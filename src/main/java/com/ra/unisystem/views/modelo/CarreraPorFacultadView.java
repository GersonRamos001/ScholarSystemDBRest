package com.ra.unisystem.views.modelo;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Table(name="vista_carreras_por_facultades")
@Immutable
public class CarreraPorFacultadView {




    private String nombre_facultad;
    @Id
    private String nombre_carrera;

    public CarreraPorFacultadView() {}




    public String getNombre_facultad() {
        return nombre_facultad;
    }

    public void setNombre_facultad(String nombre_facultad) {
        this.nombre_facultad = nombre_facultad;
    }

    public String getNombre_carrera() {
        return nombre_carrera;
    }

    public void setNombre_carrera(String nombre_carrera) {
        this.nombre_carrera = nombre_carrera;
    }
}
