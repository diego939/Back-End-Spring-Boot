/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.integrador.portafolio.service;

import com.integrador.portafolio.entity.Persona;
import java.util.List;


public interface IPersonaService {
    public List <Persona> verPersonas();
    public void crearPersona(Persona per);
    public void borrarPersona(int id);
    public Persona buscarPersona(int id);
    public void editarPersona(Persona per);
}
