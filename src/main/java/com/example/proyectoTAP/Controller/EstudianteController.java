/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectoTAP.Controller;

import com.example.proyectoTAP.Modelo.Carrera;
import com.example.proyectoTAP.Modelo.Estudiante;
import com.example.proyectoTAP.Service.CarreraService;
import com.example.proyectoTAP.Service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jessica Alvarez
 */
@RestController
@RequestMapping("/estudiante")
@CrossOrigin(origins="*")
public class EstudianteController {
      @Autowired
    EstudianteService estudianteservice;
    
    @PostMapping
    public ResponseEntity saveEstudiante(@RequestBody Estudiante estudiante){
     
     return ResponseEntity.ok(estudianteservice.crearEstudiante(estudiante));
    }
    
    @GetMapping(path= "/list")
    public ResponseEntity listEstudiante(){
        
        return ResponseEntity.ok(estudianteservice.listarEstudiante());
    }
}
