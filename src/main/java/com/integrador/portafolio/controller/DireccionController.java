/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.integrador.portafolio.controller;


import com.integrador.portafolio.entity.Direccion;
import com.integrador.portafolio.service.IDireccionService;
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
@RequestMapping("/direccion")
@CrossOrigin(origins = "*")
public class DireccionController {
    @Autowired
    private IDireccionService dirServ;
    
    List <Direccion> listaDirecciones = new ArrayList();
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/new")
    public void addDireccion(@RequestBody Direccion dir){
        dirServ.crearDireccion(dir);
    }
    
    @GetMapping ("/lista")
    @ResponseBody 
    public List<Direccion> verDirecciones(){
        
        return dirServ.verDirecciones();
    
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete/{id}")
    public void borrarDireccion(@PathVariable int id){
        dirServ.borrarDireccion(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/editar")
    public void editardireccion(@RequestBody Direccion dir){
            dirServ.editarDireccion(dir);
    }
    
    
    @GetMapping ("/buscar/{id}")
    @ResponseBody
    public Direccion buscarDireccionPorId(@PathVariable int id){
        return dirServ.buscarDireccion(id);
    }
}
