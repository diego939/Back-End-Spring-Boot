/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.integrador.portafolio.service;

import com.integrador.portafolio.entity.Direccion;
import java.util.List;

public interface IDireccionService {
    public List <Direccion> verDirecciones();
    public void crearDireccion(Direccion dir);
    public void borrarDireccion(int id);
    public Direccion buscarDireccion(int id);
    public void editarDireccion(Direccion dir);
}
