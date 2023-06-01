package com.ra.unisystem.views.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.Immutable;

@Entity
@Table(name="vista_estudiantes_por_materias")
@Immutable
public class EstudiantesPorMateriaView {
    @Id
    private Long id_persona;
    private String nombres;
    private String apellido_paterno;
    private String apellido_materno;
    private Long id_asignatura;
    private String nombre;
    public EstudiantesPorMateriaView() {
    }
    public Long getId_persona() {
        return id_persona;
    }
    public void setId_persona(Long id_persona) {
        this.id_persona = id_persona;
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
    public Long getId_asignatura() {
        return id_asignatura;
    }
    public void setId_asignatura(Long id_asignatura) {
        this.id_asignatura = id_asignatura;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
