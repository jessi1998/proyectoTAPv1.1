/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyectoTAP.Modelo;

import java.util.Date;
import java.util.List;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Jessica Alvarez
 */
@Data
@Document
public class Estudiante {
    @Id
    private Long id_estudiante;
    private Date fechaIngreso;
    private List<Persona> listapersona;
    private int id_carrera;
}
