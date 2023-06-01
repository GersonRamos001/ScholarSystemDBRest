package com.ra.unisystem.views.servicio;

import com.ra.unisystem.views.modelo.CarreraPorFacultadView;
import com.ra.unisystem.views.repositorio.CarreraPorFacultadViewRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarreraPorFacultadViewService {

    @Autowired
    private CarreraPorFacultadViewRepositorio carreraPorFacultadViewRepositorio;

    public List<CarreraPorFacultadView> getAll() {
        return carreraPorFacultadViewRepositorio.findAll();
    }
}
