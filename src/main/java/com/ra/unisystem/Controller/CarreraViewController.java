package com.ra.unisystem.Controller;


import com.ra.unisystem.views.repositorio.MateriaCarreraViewRepositorio;
import com.ra.unisystem.views.modelo.MateriasCarreraView;
import com.ra.unisystem.views.servicio.MateriaCarreraViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarreraViewController {

@Autowired
    MateriaCarreraViewService materiaCarreraViewService;
    @GetMapping("/materias")
    public List<MateriasCarreraView> getAll() {

        return materiaCarreraViewService.getAll();
    }
}
