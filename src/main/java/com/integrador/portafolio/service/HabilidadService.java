/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.integrador.portafolio.service;

import com.integrador.portafolio.entity.Habilidad;
import com.integrador.portafolio.repository.HabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService implements IHabilidadService{
    @Autowired
    public HabilidadRepository habRepo;

    @Override
    public List<Habilidad> verHabilidades() {
        
        //return habRepo.findAll();
        return habRepo.findHabilidades();
    }
    
    @Override
    public List<Habilidad> verTecnologias() {
        
        //return habRepo.findAll();
        return habRepo.findTecnologias();
    }

    @Override
    public void crearHabilidad(Habilidad hab) {
        habRepo.save(hab);
    }

    @Override
    public void borrarHabilidad(int id) {
        habRepo.deleteById(id);
    }

    @Override
    public Habilidad buscarHabilidad(int id) {
        return habRepo.findById(id).orElse(null);
    }

    @Override
    public void editarHabilidad(Habilidad hab) {
        habRepo.save(hab);
    }
    
    
}
