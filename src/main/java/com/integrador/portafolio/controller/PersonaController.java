/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.integrador.portafolio.controller;


import com.integrador.portafolio.entity.Persona;
import com.integrador.portafolio.service.IPersonaService;
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
@RequestMapping("/persona")
@CrossOrigin(origins = "https://almirondiegodavidportafolioap.web.app")
public class PersonaController {
    @Autowired
    private IPersonaService persoServ;
    
    List <Persona> listaPersonas = new ArrayList();
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/new")
    public void addPersona(@RequestBody Persona pers){
        
        persoServ.crearPersona(pers);
        
        
    }
    
    @GetMapping ("/lista")
    @ResponseBody 
    public List<Persona> verPersonas(){
        
        return persoServ.verPersonas();
    
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona(@PathVariable int id){
        persoServ.borrarPersona(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/editar")
    public void editarPersona(@RequestBody Persona pers){
            persoServ.editarPersona(pers);
    }
    
    
    @GetMapping ("/buscar/{id}")
    @ResponseBody
    public Persona buscarPersonaPorId(@PathVariable int id){
        return persoServ.buscarPersona(id);
    }
}
