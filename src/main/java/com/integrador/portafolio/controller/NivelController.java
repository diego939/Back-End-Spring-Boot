/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.integrador.portafolio.controller;

import com.integrador.portafolio.entity.Nivel;
import com.integrador.portafolio.service.INivelService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nivel")
@CrossOrigin(origins = "https://almirondiegodavidportafolioap.web.app")
public class NivelController {
    
    @Autowired
    public INivelService nivServ;
    
    List <Nivel> listaNivel = new ArrayList();
    
    @GetMapping("/ver")
    @ResponseBody
    public List <Nivel> verNiveles(){
        return nivServ.verNiveles();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new")
    public void crearNivel(@RequestBody Nivel niv){
        nivServ.crearNivel(niv);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public void borrarNivel(@PathVariable int id){
        nivServ.borrarNivel(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar")
    public void editarNivel(@RequestBody Nivel niv){
        nivServ.editarNivel(niv);
    }
    
    @GetMapping("/buscar/{id}")
    @ResponseBody
    public Nivel buscarNivel(@PathVariable int id){
        return nivServ.buscarNivel(id);
    }
}
