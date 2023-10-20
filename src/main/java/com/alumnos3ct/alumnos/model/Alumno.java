package com.alumnos3ct.alumnos.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class Alumno {
    public List<AlumnoRecord> alumnos;
    public Alumno() {
        alumnos = new ArrayList<>();
        alumnos.add(new AlumnoRecord("Miguel",10,"Español","Sexto"));
        alumnos.add(new AlumnoRecord("Karla",9,"Matematicas","Quinto"));
        alumnos.add(new AlumnoRecord("Laura",8,"Español","Sexto"));
        alumnos.add(new AlumnoRecord("Diego",10,"Matematicas","Quinto"));
    }
}
