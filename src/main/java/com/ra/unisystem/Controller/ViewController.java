package com.ra.unisystem.Controller;

import com.ra.unisystem.views.modelo.*;
import com.ra.unisystem.views.servicio.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ViewController {
    @Autowired
    CarreraPorFacultadViewService carreraPorFacultadViewService;
    @Autowired
    MateriaPorCarreraViewService materiaPorCarreraViewService;
    @Autowired
    GruposEstudiantesViewService gruposEstudiantesViewService;
    @Autowired
    EstudiantesPorMateriaViewService estudiantesPorMateriaViewService;
    @Autowired
    EstudiantesMatriculadosViewService estudiantesMatriculadosViewService;
    @GetMapping("/carreraFacultadView")
    public List<CarreraPorFacultadView> carreraPorFacultadView() {
        return carreraPorFacultadViewService.getAll();
    }
    @GetMapping("/materiaCarreraView")
    public List<MateriaPorCarreraView> materiaPorCarreraView(){
        return materiaPorCarreraViewService.getAll();
    }
    @GetMapping("/gruposEstudiantesView")
    public List<GruposEstudiantesView> gruposEstudiantesView(){return gruposEstudiantesViewService.getAll();}
    @GetMapping("/estudiantesMateriasView")
    public List<EstudiantesPorMateriaView> estudiantesPorMateriaView(){return estudiantesPorMateriaViewService.getAll();}
    @GetMapping("/estudiantesMatriculadosView")
    public List<EstudiantesMatriculadosView> estudiantesMatriculadosView(){return estudiantesMatriculadosViewService.getAll();}
}
