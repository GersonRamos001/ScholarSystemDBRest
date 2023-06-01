package com.ra.unisystem;

import com.ra.unisystem.modelo.Carrera;
import com.ra.unisystem.servicio.CarreraServicio;
import com.ra.unisystem.views.MateriaCarreraViewRepositorio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class UniSystemApplication  implements CommandLineRunner {

    private final CarreraServicio carreraServicio;

    public UniSystemApplication(CarreraServicio carreraServicio, MateriaCarreraViewRepositorio materiaCarreraViewRepositorio) {
        this.carreraServicio = carreraServicio;
        this.materiaCarreraViewRepositorio = materiaCarreraViewRepositorio;
    }

    private final MateriaCarreraViewRepositorio materiaCarreraViewRepositorio;


    public static void main(String[] args) {
        SpringApplication.run(UniSystemApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Carrera carrera = new Carrera();
        carrera.setNombre("Licenciatura en Comunicaciones");
        carrera.setIdfacultad(3L);
        carreraServicio.saveCarrera(carrera);


    }
}
