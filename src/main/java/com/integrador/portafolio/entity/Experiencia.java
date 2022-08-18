/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.integrador.portafolio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String puesto;
    private String empresa;
    private String descripcion;
    private String anioIngreso;
    private String anioEgreso;
    private String imageExperiencia;

    public Experiencia() {
    }

    public Experiencia(String puesto, String empresa, String descripcion, String anioIngreso, String anioEgreso, String imageExperiencia) {
        this.puesto = puesto;
        this.empresa = empresa;
        this.descripcion = descripcion;
        this.anioIngreso = anioIngreso;
        this.anioEgreso = anioEgreso;
        this.imageExperiencia = imageExperiencia;
    }

     
    
    
}
