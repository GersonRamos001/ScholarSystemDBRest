package com.ra.unisystem.views.repositorio;

import com.ra.unisystem.views.modelo.CarreraPorFacultadView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarreraPorFacultadViewRepositorio extends JpaRepository<CarreraPorFacultadView, Long> {
}
