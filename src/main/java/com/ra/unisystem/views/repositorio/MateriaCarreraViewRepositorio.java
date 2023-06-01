package com.ra.unisystem.views.repositorio;

import com.ra.unisystem.views.modelo.MateriasCarreraView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaCarreraViewRepositorio extends JpaRepository<MateriasCarreraView, Long> {
}
