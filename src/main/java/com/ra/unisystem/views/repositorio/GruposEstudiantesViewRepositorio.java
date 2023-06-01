package com.ra.unisystem.views.repositorio;

import com.ra.unisystem.views.modelo.GruposEstudiantesView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GruposEstudiantesViewRepositorio extends JpaRepository<GruposEstudiantesView, Long> {
}
