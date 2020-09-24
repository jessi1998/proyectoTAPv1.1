/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectoTAP.Service;

import com.example.proyectoTAP.Modelo.Estudiante;
import com.example.proyectoTAP.Repository.EstudianteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jessica Alvarez
 */
@Service
public class EstudianteService {
    @Autowired
    EstudianteRepository estudianterepository;
    
     public Estudiante crearEstudiante(Estudiante est){
        return estudianterepository.save(est);
    }
    
    public List<Estudiante> listarEstudiante(){
        return estudianterepository.findAll();
}
}