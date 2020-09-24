/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectoTAP.Service;

import com.example.proyectoTAP.Modelo.Bitacora;
import com.example.proyectoTAP.Repository.BitacoraRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jessica Alvarez
 */
@Service
public class BitacoraService {
    @Autowired
    BitacoraRepository bitacorarepository;
    
     public Bitacora crearBitacora(Bitacora bita){
        return bitacorarepository.save(bita);
    }
    
    public List<Bitacora> ListarBitacora(){
        return bitacorarepository.findAll();
}
}
