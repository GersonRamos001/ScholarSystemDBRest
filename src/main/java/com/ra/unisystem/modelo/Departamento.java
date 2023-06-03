package com.ra.unisystem.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "departamentos", schema = "dbo")
public class Departamento {
    @Id
    @Column(name = "id_departamento", nullable = false)
    private Integer id;

    @Column(name = "nombre_departamento", nullable = false, length = 100)
    private String nombreDepartamento;

}