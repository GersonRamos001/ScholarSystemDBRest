package com.ra.unisystem.views.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.Immutable;

@Entity
@Table(name="vista_estudiantes_matriculados")
@Immutable
public class EstudiantesMatriculadosView {
    @Id
    private Long id_estudiante;
    private String carnet;
    private Long id_carrera;
    private String nombres;
    private String apellido_paterno;
    private String apellido_materno;
    public EstudiantesMatriculadosView() {
    }
    public Long getId_estudiante() {
        return id_estudiante;
    }
    public void setId_estudiante(Long id_estudiante) {
        this.id_estudiante = id_estudiante;
    }
    public String getCarnet() {
        return carnet;
    }
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
    public Long getId_carrera() {
        return id_carrera;
    }
    public void setId_carrera(Long id_carrera) {
        this.id_carrera = id_carrera;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellido_paterno() {
        return apellido_paterno;
    }
    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }
    public String getApellido_materno() {
        return apellido_materno;
    }
    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }
}
