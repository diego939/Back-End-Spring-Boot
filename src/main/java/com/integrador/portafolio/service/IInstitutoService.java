/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.integrador.portafolio.service;

import com.integrador.portafolio.entity.Instituto;
import java.util.List;


public interface IInstitutoService {
    public List <Instituto> verInstitutos();
    public void crearInstituto(Instituto ins);
    public void borrarInstituto(int id);
    public Instituto buscarInstituto(int id);
    public void editarInstituto(Instituto ins);
}
