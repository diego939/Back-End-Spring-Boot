/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.integrador.portafolio.service;

import com.integrador.portafolio.entity.Instituto;
import com.integrador.portafolio.repository.InstitutoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstitutoService implements IInstitutoService{
    
    @Autowired
    public InstitutoRepository insRepo;
    
    @Override
    public List<Instituto> verInstitutos() {
        return insRepo.findAll();
    }

    @Override
    public void crearInstituto(Instituto ins) {
        insRepo.save(ins);
    }

    @Override
    public void borrarInstituto(int id) {
        insRepo.deleteById(id);
    }

    @Override
    public Instituto buscarInstituto(int id) {
        return insRepo.findById(id).orElse(null);
    }

    @Override
    public void editarInstituto(Instituto ins) {
        insRepo.save(ins);
    }
    
}
