/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectoTAP.Service;

import com.example.proyectoTAP.Modelo.Carrera;
import com.example.proyectoTAP.Repository.CarreraRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jessica Alvarez
 */
@Service
public class CarreraService {
     @Autowired
     CarreraRepository carrerarepository;
     
     public Carrera crearCarrera(Carrera carre){
        return carrerarepository.save(carre);
    }
    
    public List<Carrera> listarCarrera(){
        return carrerarepository.findAll();
}
}
