package com.ra.unisystem.views.repositorio;

import com.ra.unisystem.views.modelo.CarreraPorFacultadView;
import com.ra.unisystem.views.modelo.MateriaPorCarreraView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaPorCarreraViewRepositorio extends JpaRepository<MateriaPorCarreraView, Long> {
}
