package com.ra.unisystem.views.repositorio;

import com.ra.unisystem.views.modelo.EstudiantesPorMateriaView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudiantesPorMateriaViewRepositorio extends JpaRepository<EstudiantesPorMateriaView,Long> {
}
