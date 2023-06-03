package com.ra.unisystem.repositorio;

import com.ra.unisystem.modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {
}