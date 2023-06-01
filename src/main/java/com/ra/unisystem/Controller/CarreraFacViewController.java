package com.ra.unisystem.Controller;


import com.ra.unisystem.views.modelo.CarreraPorFacultadView;
import com.ra.unisystem.views.servicio.CarreraPorFacultadViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarreraFacViewController {

@Autowired
CarreraPorFacultadViewService carreraPorFacultadViewService;
    @GetMapping("/carrerasFac")
    public List<CarreraPorFacultadView> getAll() {

        return carreraPorFacultadViewService.getAll();
    }
}
