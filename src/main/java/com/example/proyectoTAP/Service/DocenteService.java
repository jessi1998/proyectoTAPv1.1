/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectoTAP.Service;

import com.example.proyectoTAP.Modelo.Docente;
import com.example.proyectoTAP.Repository.DocenteReposotory;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jessica Alvarez
 */
@Service
public class DocenteService {
    @Autowired
    DocenteReposotory docenterepository;
     public Docente crearDocente(Docente doce){
        return docenterepository.save(doce);
    }
    
    public List<Docente> listarDocente(){
        return docenterepository.findAll();
    }
}
