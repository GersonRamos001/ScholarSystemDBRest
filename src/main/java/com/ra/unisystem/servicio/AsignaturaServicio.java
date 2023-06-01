package com.ra.unisystem.servicio;

import com.ra.unisystem.modelo.Asignatura;
import com.ra.unisystem.modelo.Carrera;
import com.ra.unisystem.repositorio.AsignaturaRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsignaturaServicio {


    private final AsignaturaRepositorio asignaturaRepositorio;


    public AsignaturaServicio(AsignaturaRepositorio asignaturaRepositorio) {
        this.asignaturaRepositorio = asignaturaRepositorio;
    }

    public List<Asignatura> getAll(){
        return asignaturaRepositorio.findAll();
    }



}
