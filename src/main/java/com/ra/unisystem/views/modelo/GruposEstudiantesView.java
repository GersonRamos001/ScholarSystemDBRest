package com.ra.unisystem.views.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.Immutable;

@Entity
@Table(name="vista_grupos_estudiantes")
@Immutable
public class GruposEstudiantesView {
    @Id
    private Long id_estudiante;
    private String nombres;
    private String apellido_paterno;
    private Long id_grupo;
    private String nombre_grupo;
    public GruposEstudiantesView() {
    }
    public Long getId_estudiante() {
        return id_estudiante;
    }
    public void setId_estudiante(Long id_estudiante) {
        this.id_estudiante = id_estudiante;
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
    public Long getId_grupo() {
        return id_grupo;
    }
    public void setId_grupo(Long id_grupo) {
        this.id_grupo = id_grupo;
    }
    public String getNombre_grupo() {
        return nombre_grupo;
    }
    public void setNombre_grupo(String nombre_grupo) {
        this.nombre_grupo = nombre_grupo;
    }
}
