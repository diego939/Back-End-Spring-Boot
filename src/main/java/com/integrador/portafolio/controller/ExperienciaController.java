/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.integrador.portafolio.controller;

import com.integrador.portafolio.entity.Experiencia;
import com.integrador.portafolio.service.IExperienciaService;
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
@RequestMapping("/experiencia")
@CrossOrigin(origins = "https://almirondiegodavidportafolioap.web.app")
public class ExperienciaController {
    @Autowired
    private IExperienciaService expServ;
    
    List <Experiencia> listaExperiencia = new ArrayList();
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new")
    public void addExperiencia(@RequestBody Experiencia exp){
        expServ.crearExperiencia(exp);
    }
    
    @GetMapping("/ver")
    @ResponseBody
    public List <Experiencia> verExperiencias(){
        return expServ.verExperiencias();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public void borrarExperiencia(@PathVariable int id){
        expServ.borrarExperiencia(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar")
    public void editarExperiencia(@RequestBody Experiencia exp){
        expServ.editarExperiencia(exp);
    }
    
    @GetMapping("/buscar/{id}")
    @ResponseBody
    public Experiencia buscarExperiencia(@PathVariable int id){
        return expServ.buscarExperiencia(id);
    }
}
