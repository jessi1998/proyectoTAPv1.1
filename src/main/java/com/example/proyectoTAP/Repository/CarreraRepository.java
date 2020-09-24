/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectoTAP.Repository;

import com.example.proyectoTAP.Modelo.Asignatura;
import com.example.proyectoTAP.Modelo.Carrera;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jessica Alvarez
 */
@Repository
public interface CarreraRepository  extends MongoRepository<Carrera,Long>{
    
}
