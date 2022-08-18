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
@RequestMapping("/tecnologia")
@CrossOrigin(origins = "*")
public class TecnologiaController {
    @Autowired
    private IHabilidadService habServ;
    
    List <Habilidad> listaHabilidad = new ArrayList();
    
    @GetMapping("/ver")
    @ResponseBody
    public List <Habilidad> verTecnologias(){
        return habServ.verTecnologias();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new")
    public void addTecnologia(@RequestBody Habilidad tec){
        tec.setTipoHabilidadId(2);
        habServ.crearHabilidad(tec);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public void borrarTecnologia(@PathVariable int id){
        habServ.borrarHabilidad(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar")
    public void editarTecnologia(@RequestBody Habilidad tec){
        tec.setTipoHabilidadId(2);
        habServ.editarHabilidad(tec);
    }
    
    @GetMapping("/buscar/{id}")
    @ResponseBody
    public Habilidad buscarTecnologia(@PathVariable int id){
        return habServ.buscarHabilidad(id);
    }
}
