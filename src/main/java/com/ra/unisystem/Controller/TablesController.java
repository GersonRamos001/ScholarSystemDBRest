package com.ra.unisystem.Controller;

import com.ra.unisystem.modelo.Asignatura;
import com.ra.unisystem.modelo.Carrera;
import com.ra.unisystem.servicio.AsignaturaServicio;
import com.ra.unisystem.servicio.CarreraServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TablesController {
    @Autowired
    CarreraServicio carreraServicio;

    @Autowired
    AsignaturaServicio asignaturaServicio;


    @GetMapping("/carreras")
    public List<Carrera> getAllCarreras() {
        return carreraServicio.getAll();
    }

    @GetMapping("/asignaturas")
    public List<Asignatura> getAllAsignaturas() {
        return asignaturaServicio.getAll();
    }




}
