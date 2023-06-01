package com.ra.unisystem.views.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.Immutable;

@Entity
@Table(name="vista_materias_por_carrera")
@Immutable
public class MateriaPorCarreraView {
    private String nombre_carrera;
    @Id
    private String nombre_asignatura;
    public MateriaPorCarreraView() {
    }
    public String getNombre_carrera() {
        return nombre_carrera;
    }
    public void setNombre_carrera(String nombre_carrera) {
        this.nombre_carrera = nombre_carrera;
    }
    public String getNombre_asignatura() {
        return nombre_asignatura;
    }
    public void setNombre_asignatura(String nombre_asignatura) {
        this.nombre_asignatura = nombre_asignatura;
    }
}
