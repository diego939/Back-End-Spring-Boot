/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.integrador.portafolio.controller;

import com.integrador.portafolio.entity.Habilidad;
import com.integrador.portafolio.service.IHabilidadService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
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
@RequestMapping("/habilidad")
@CrossOrigin(origins = "*")
public class HabilidadController {
    @Autowired
    private IHabilidadService habServ;
    
    List <Habilidad> listaHabilidad = new ArrayList();
    
    @GetMapping("/ver")
    @ResponseBody
    public List <Habilidad> verHabilidades(){
        return habServ.verHabilidades();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new")
    public void addHabilidad(@RequestBody Habilidad hab){
        hab.setTipoHabilidadId(1);
        habServ.crearHabilidad(hab);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public void borrarHabilidad(@PathVariable int id){
        habServ.borrarHabilidad(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar")
    public void editarHabilidad(@RequestBody Habilidad hab){
        hab.setTipoHabilidadId(1);
        habServ.editarHabilidad(hab);
    }
    
    @GetMapping("/buscar/{id}")
    @ResponseBody
    public Habilidad buscarHabilidad(@PathVariable int id){
        return habServ.buscarHabilidad(id);
    }
}
