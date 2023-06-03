package com.ra.unisystem.repositorio;

import com.ra.unisystem.modelo.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<Departamento, Integer> {
}