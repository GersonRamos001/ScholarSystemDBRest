package com.ra.unisystem.views.servicio;

import com.ra.unisystem.views.modelo.MateriaPorCarreraView;
import com.ra.unisystem.views.repositorio.MateriaPorCarreraViewRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriaPorCarreraViewService {
    @Autowired
    private MateriaPorCarreraViewRepositorio materiaPorCarreraViewRepositorio;
    public List<MateriaPorCarreraView> getAll(){return materiaPorCarreraViewRepositorio.findAll();}
}
