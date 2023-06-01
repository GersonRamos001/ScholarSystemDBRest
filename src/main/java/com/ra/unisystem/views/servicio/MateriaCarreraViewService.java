package com.ra.unisystem.views.servicio;

import com.ra.unisystem.views.modelo.MateriasCarreraView;
import com.ra.unisystem.views.repositorio.MateriaCarreraViewRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriaCarreraViewService {

    @Autowired
    private MateriaCarreraViewRepositorio materiaCarreraViewRepositorio;

    public List<MateriasCarreraView> getAll() {
        return materiaCarreraViewRepositorio.findAll();
    }
}
