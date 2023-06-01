package com.ra.unisystem;

import com.ra.unisystem.servicio.CarreraServicio;
import com.ra.unisystem.views.repositorio.CarreraPorFacultadViewRepositorio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UniSystemApplication  implements CommandLineRunner {

    private final CarreraServicio carreraServicio;

    public UniSystemApplication(CarreraServicio carreraServicio, CarreraPorFacultadViewRepositorio carreraPorFacultadViewRepositorio) {
        this.carreraServicio = carreraServicio;
        this.carreraPorFacultadViewRepositorio = carreraPorFacultadViewRepositorio;
    }

    private final CarreraPorFacultadViewRepositorio carreraPorFacultadViewRepositorio;


    public static void main(String[] args) {
        SpringApplication.run(UniSystemApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    }
}
