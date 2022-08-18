/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.integrador.portafolio.service;

import com.integrador.portafolio.entity.Experiencia;
import java.util.List;


public interface IExperienciaService {
    public List <Experiencia> verExperiencias();
    public void crearExperiencia(Experiencia exp);
    public void borrarExperiencia(int id);
    public Experiencia buscarExperiencia(int id);
    public void editarExperiencia(Experiencia exp);
}
