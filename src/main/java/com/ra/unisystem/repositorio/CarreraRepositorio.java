package com.ra.unisystem.repositorio;

import com.ra.unisystem.modelo.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarreraRepositorio extends JpaRepository<Carrera, Long> {

}
