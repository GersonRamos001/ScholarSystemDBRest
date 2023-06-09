package com.ra.unisystem.servicio;

import com.ra.unisystem.modelo.Carrera;
import com.ra.unisystem.repositorio.CarreraRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarreraServicio {
    private final CarreraRepositorio carreraRepositorio;


    public CarreraServicio(CarreraRepositorio carreraRepositorio) {
        this.carreraRepositorio = carreraRepositorio;
    }

    public void saveCarrera(Carrera carrera){
            carreraRepositorio.save(carrera);
    }

    public List<Carrera> getAll(){
        return carreraRepositorio.findAll();
    }
}
