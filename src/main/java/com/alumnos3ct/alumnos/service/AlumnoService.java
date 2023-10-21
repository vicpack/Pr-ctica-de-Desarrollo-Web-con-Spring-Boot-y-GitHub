package com.alumnos3ct.alumnos.service;

import com.alumnos3ct.alumnos.model.AlumnoRecord;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface AlumnoService {
    List<AlumnoRecord> obtenerAlumnos(@PathVariable String curso );
    List<AlumnoRecord> listarAlumnos();
    void agregar(AlumnoRecord alumno);
}
