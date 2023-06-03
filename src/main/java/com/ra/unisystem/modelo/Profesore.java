package com.ra.unisystem.modelo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "profesores", schema = "dbo")
public class Profesore {
    @Id
    @Column(name = "id_profesor", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_profesor", nullable = false)
    private Persona persona;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_facultad")
    private Facultade idFacultad;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_especializacion")
    private Especializacione idEspecializacion;

    @Column(name = "fecha_ingreso")
    private LocalDate fechaIngreso;

    @Column(name = "salario", precision = 10, scale = 2)
    private BigDecimal salario;

    @Column(name = "activo", columnDefinition = "tinyint")
    private Short activo;

    @Column(name = "fecha_creacion")
    private Instant fechaCreacion;

    @Column(name = "fecha_modificacion")
    private Instant fechaModificacion;

    @OneToMany(mappedBy = "idProfesor")
    private Set<Grupo> grupos = new LinkedHashSet<>();

}