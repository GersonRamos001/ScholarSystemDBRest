package com.ra.unisystem.Controller;


import com.ra.unisystem.views.MateriaCarreraViewRepositorio;
import com.ra.unisystem.views.MateriasCarreraView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarreraViewController {

    private final MateriaCarreraViewRepositorio materiaCarreraViewRepositorio;

    public CarreraViewController(MateriaCarreraViewRepositorio materiaCarreraViewRepositorio) {
        this.materiaCarreraViewRepositorio = materiaCarreraViewRepositorio;
    }


    @GetMapping("/view")
    public List<MateriasCarreraView> getAll() {
        return materiaCarreraViewRepositorio.findAll();
    }
}
