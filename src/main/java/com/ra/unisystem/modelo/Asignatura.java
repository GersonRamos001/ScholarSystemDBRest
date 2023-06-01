package com.ra.unisystem.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="asignaturas")
public class Asignatura {

    @Id
    long id;
}
