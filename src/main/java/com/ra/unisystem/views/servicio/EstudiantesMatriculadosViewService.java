package com.ra.unisystem.views.servicio;

import com.ra.unisystem.views.modelo.EstudiantesMatriculadosView;
import com.ra.unisystem.views.repositorio.EstudiantesMatriculadosViewRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudiantesMatriculadosViewService {
    @Autowired
    private EstudiantesMatriculadosViewRepositorio estudiantesMatriculadosViewRepositorio;
    public List<EstudiantesMatriculadosView> getAll(){return estudiantesMatriculadosViewRepositorio.findAll();}
}
