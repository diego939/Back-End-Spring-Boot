/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.integrador.portafolio.service;

import com.integrador.portafolio.entity.Habilidad;
import java.util.List;
import org.springframework.data.jpa.repository.Query;


public interface IHabilidadService {
    public List <Habilidad> verHabilidades();
    public List<Habilidad> verTecnologias();
    public void crearHabilidad(Habilidad hab);
    public void borrarHabilidad(int id);
    public Habilidad buscarHabilidad(int id);
    public void editarHabilidad(Habilidad hab);
}
