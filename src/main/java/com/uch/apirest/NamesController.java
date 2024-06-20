package com.uch.apirest;

import com.uch.apirest.Alumno;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/apisaludos")
public class NamesController {

    @GetMapping("/alumnos")
    public List<Alumno> getAlumnos() {
        // Corrected initialization of array
        Alumno[] autos = new Alumno[3];

        autos[0] = new Alumno("Brenda", "Salmaso", 2002);
        autos[1] = new Alumno("Rocio", "Santilli", 2003);
        autos[2] = new Alumno("Lucrecia", "Concati", 2001);

        // Convert array to a mutable List
        List<Alumno> alumnoList = new ArrayList<>(Arrays.asList(autos));

        // Modify elements in the list, esto se puede borrar
        alumnoList.forEach(alumno -> {
            alumno.setApellido("Modificado");
            alumno.setAñoNacimiento(alumno.getAñoNacimiento() + 7);
        });


        return alumnoList;
    }
}
