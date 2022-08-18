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
public class Instituto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String instituto;
    private String titulo;
    private String anioIngreso;
    private String anioEgreso;
    private String imageInstituto;

    public Instituto() {
    }

    public Instituto(String instituto, String titulo, String anioIngreso, String anioEgreso, String imageInstituto) {
        this.instituto = instituto;
        this.titulo = titulo;
        this.anioIngreso = anioIngreso;
        this.anioEgreso = anioEgreso;
        this.imageInstituto = imageInstituto;
    }

}
