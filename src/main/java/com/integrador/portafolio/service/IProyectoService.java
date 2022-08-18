/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.integrador.portafolio.service;

import com.integrador.portafolio.entity.Proyecto;
import java.util.List;


public interface IProyectoService {
    public List <Proyecto> verProyectos();
    public void crearProyecto(Proyecto pro);
    public void borrarProyecto(int id);
    public Proyecto buscarProyecto(int id);
    public void editarProyecto(Proyecto pro);
}
