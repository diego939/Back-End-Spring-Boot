/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.integrador.portafolio.controller;


import com.integrador.portafolio.entity.Proyecto;
import com.integrador.portafolio.service.IProyectoService;
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
@RequestMapping("/proyecto")
@CrossOrigin(origins = "https://almirondiegodavidportafolioap.web.app")
public class ProyectoController {
    
    @Autowired
    private IProyectoService proServ;
    
    List <Proyecto> listaProyecto = new ArrayList();
    
    @GetMapping("/ver")
    @ResponseBody
    public List <Proyecto> verProyectos(){
        return proServ.verProyectos();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new")
    public void addProyecto(@RequestBody Proyecto pro){
        proServ.crearProyecto(pro);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public void borrarProyecto(@PathVariable int id){
        proServ.borrarProyecto(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar")
    public void editarProyecto(@RequestBody Proyecto pro){
        proServ.editarProyecto(pro);
    }
    
    @GetMapping("/buscar/{id}")
    @ResponseBody
    public Proyecto buscarProyecto(@PathVariable int id){
        return proServ.buscarProyecto(id);
    }
}
