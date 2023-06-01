package com.ra.unisystem.views.servicio;

import com.ra.unisystem.views.modelo.GruposEstudiantesView;
import com.ra.unisystem.views.repositorio.GruposEstudiantesViewRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GruposEstudiantesViewService {
    @Autowired
    private GruposEstudiantesViewRepositorio gruposEstudiantesViewRepositorio;
    public List<GruposEstudiantesView>getAll(){return gruposEstudiantesViewRepositorio.findAll();}
}
