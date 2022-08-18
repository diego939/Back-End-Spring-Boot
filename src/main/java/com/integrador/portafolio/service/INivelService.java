/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.integrador.portafolio.service;

import com.integrador.portafolio.entity.Nivel;
import java.util.List;


public interface INivelService {
    public List <Nivel> verNiveles();
    public void crearNivel(Nivel niv);
    public void borrarNivel(int id);
    public Nivel buscarNivel(int id);
    public void editarNivel(Nivel niv);
}
