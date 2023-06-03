package com.ra.unisystem.modelo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "persona", schema = "dbo")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona", nullable = false)
    private Integer id;

    @Column(name = "nombres", nullable = false, length = 50)
    private String nombres;

    @Column(name = "apellido_paterno", length = 50)
    private String apellidoPaterno;

    @Column(name = "apellido_materno", length = 50)
    private String apellidoMaterno;

    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate fechaNacimiento;

    @Column(name = "sexo", nullable = false)
    private Character sexo;

    @Column(name = "nacionalidad", length = 50)
    private String nacionalidad;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "telefono", length = 20)
    private String telefono;

    @Column(name = "celular", length = 20)
    private String celular;

    @Column(name = "direccion", length = 200)
    private String direccion;

    @OneToOne(mappedBy = "persona")
    private Empleado empleado;

    @OneToOne(mappedBy = "persona")
    private Estudiante estudiante;

    @OneToOne(mappedBy = "persona")
    private Profesore profesore;

}