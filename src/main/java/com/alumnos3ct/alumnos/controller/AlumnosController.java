package com.alumnos3ct.alumnos.controller;

import com.alumnos3ct.alumnos.model.AlumnoRecord;
import com.alumnos3ct.alumnos.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class AlumnosController {
    @Autowired
    AlumnoService alumnoService;

    @GetMapping("/v1/alumnos/{marca}")
    public List<AlumnoRecord> obtenerAlumnos(@PathVariable String curso){
        return alumnoService.obtenerAlumnos(curso);
    }

    @GetMapping
    public List<AlumnoRecord> listarCompus(){
        return alumnoService.listarAlumnos();
    }
}
