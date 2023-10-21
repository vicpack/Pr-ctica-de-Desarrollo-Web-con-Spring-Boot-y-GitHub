package com.alumnos3ct.alumnos.controller;

import com.alumnos3ct.alumnos.model.AlumnoRecord;
import com.alumnos3ct.alumnos.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class AlumnosController {
    @Autowired
    AlumnoService alumnoService;

    @GetMapping("/v1/alumnos/{curso}")
    public List<AlumnoRecord> obtenerAlumnos(@PathVariable String curso){
        return alumnoService.obtenerAlumnos(curso);
    }

    @GetMapping("/v1/alumnos")
    public List<AlumnoRecord> listarAlumnos(){
        return alumnoService.listarAlumnos();
    }

    @PostMapping("/v1/alumnos/agregarAlumno")
    public String agregarAlumno(@RequestBody AlumnoRecord alumno){
        alumnoService.agregar(alumno);
        return "OK";
    }

}
