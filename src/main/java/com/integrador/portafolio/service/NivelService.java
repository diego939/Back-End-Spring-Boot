/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.integrador.portafolio.service;

import com.integrador.portafolio.entity.Nivel;
import com.integrador.portafolio.repository.NivelRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NivelService implements INivelService{

    @Autowired
    public NivelRepository nivRepo;
    
    @Override
    public List<Nivel> verNiveles() {
        return nivRepo.findAll();
    }

    @Override
    public void crearNivel(Nivel niv) {
        nivRepo.save(niv);
    }

    @Override
    public void borrarNivel(int id) {
        nivRepo.deleteById(id);
    }

    @Override
    public Nivel buscarNivel(int id) {
        return nivRepo.findById(id).orElse(null);
    }

    @Override
    public void editarNivel(Nivel niv) {
        nivRepo.save(niv);
    }
    
}
