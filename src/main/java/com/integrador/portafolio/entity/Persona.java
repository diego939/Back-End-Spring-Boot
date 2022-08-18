/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.integrador.portafolio.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombres;
    private String apellido;
    //private Date fechaNacimiento = new Date();
    private String nacionalidad;
    private String email;
    private String celular;
    private String sobreMi;
    private String ocupacion;
    private String imagePortada;
    private String imagePerfil;

    public Persona() {
    }

    public Persona(int id, String nombres, String apellido, String nacionalidad, String pais, String provincia, String localidad, String email, String celular, String sobreMi, String ocupacion, String imagePortada, String imagePerfil) {
        this.id = id;
        this.nombres = nombres;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.email = email;
        this.celular = celular;
        this.sobreMi = sobreMi;
        this.ocupacion = ocupacion;
        this.imagePortada = imagePortada;
        this.imagePerfil = imagePerfil;
    }
    
    
}
