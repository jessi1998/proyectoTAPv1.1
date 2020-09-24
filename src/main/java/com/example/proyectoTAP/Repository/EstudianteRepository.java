/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectoTAP.Repository;

import com.example.proyectoTAP.Modelo.Estudiante;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Jessica Alvarez
 */
public interface EstudianteRepository  extends MongoRepository<Estudiante, Long>{
    
}
