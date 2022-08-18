/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.integrador.portafolio.service;

import com.integrador.portafolio.entity.Direccion;
import com.integrador.portafolio.repository.DireccionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DireccionService implements IDireccionService{

    @Autowired
    public DireccionRepository dirRepo;
    
    @Override
    public List<Direccion> verDirecciones() {
        return dirRepo.findAll();
    }

    @Override
    public void crearDireccion(Direccion dir) {
       dirRepo.save(dir);
    }

    @Override
    public void borrarDireccion(int id) {
        dirRepo.deleteById(id);
    }

    @Override
    public Direccion buscarDireccion(int id) {
        return dirRepo.findById(id).orElse(null);
    }

    @Override
    public void editarDireccion(Direccion dir) {
        dirRepo.save(dir);
    }
    
}
