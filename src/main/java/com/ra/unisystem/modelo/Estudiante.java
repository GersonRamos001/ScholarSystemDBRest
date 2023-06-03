package com.ra.unisystem.modelo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "estudiante", schema = "dbo")
public class Estudiante {
    @Id
    @Column(name = "id_estudiante", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_estudiante", nullable = false)
    private Persona persona;

    @Column(name = "carnet", length = 8)
    private String carnet;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_carrera")
    private Carrera idCarrera;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_nivel_educativo")
    private NivelesEducativo idNivelEducativo;

    @Column(name = "activo", columnDefinition = "tinyint")
    private Short activo;

    @Column(name = "fecha_creacion")
    private Instant fechaCreacion;

    @Column(name = "fecha_modificacion")
    private Instant fechaModificacion;

    @OneToMany(mappedBy = "idEstudiante")
    private Set<EstudiantesGrupo> estudiantesGrupos = new LinkedHashSet<>();

}