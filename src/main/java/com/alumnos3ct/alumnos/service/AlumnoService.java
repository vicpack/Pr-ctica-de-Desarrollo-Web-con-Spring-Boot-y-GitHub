package com.alumnos3ct.alumnos.service;

import com.alumnos3ct.alumnos.model.Alumno;
import com.alumnos3ct.alumnos.model.AlumnoRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlumnoService {
    private Alumno alumnoModelo;
    @Autowired
    public AlumnoService(Alumno alumnoModelo) {
        this.alumnoModelo = alumnoModelo;
    }


    public List<AlumnoRecord> obtenerAlumnos(@PathVariable String curso ){
        return alumnoModelo.alumnos.stream()
                .filter(alumno -> alumno.curso().equals(curso))
                        .collect(Collectors.toList());
    }

    public List<AlumnoRecord> listarAlumnos(){
        return alumnoModelo.alumnos.stream().toList();
    }


}
