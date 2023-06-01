package com.ra.unisystem.views.repositorio;

import com.ra.unisystem.views.modelo.EstudiantesMatriculadosView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudiantesMatriculadosViewRepositorio extends JpaRepository<EstudiantesMatriculadosView,Long> {
}
