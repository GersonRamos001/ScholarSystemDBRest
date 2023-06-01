package com.ra.unisystem.views.servicio;

import com.ra.unisystem.views.modelo.EstudiantesPorMateriaView;
import com.ra.unisystem.views.repositorio.EstudiantesPorMateriaViewRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudiantesPorMateriaViewService {
    @Autowired
    EstudiantesPorMateriaViewRepositorio estudiantesPorMateriaViewRepositorio;
    public List<EstudiantesPorMateriaView> getAll(){return estudiantesPorMateriaViewRepositorio.findAll();}
}
