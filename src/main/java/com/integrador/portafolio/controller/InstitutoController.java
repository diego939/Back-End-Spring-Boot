/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.integrador.portafolio.controller;


import com.integrador.portafolio.entity.Instituto;
import com.integrador.portafolio.service.IInstitutoService;
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
@RequestMapping("/instituto")
@CrossOrigin(origins = "*")
public class InstitutoController {
    @Autowired
    private IInstitutoService insServ;
    
    List <Instituto> listaInstituto = new ArrayList();
    
    @GetMapping("/ver")
    @ResponseBody
    public List <Instituto> verInstitutos(){
        return insServ.verInstitutos();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new")
    public void addInstituto(@RequestBody Instituto ins){
        insServ.crearInstituto(ins);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public void borrarInstituto(@PathVariable int id){
        insServ.borrarInstituto(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar")
    public void editarInstituto(@RequestBody Instituto ins){
        insServ.editarInstituto(ins);
    }
    
    @GetMapping("/buscar/{id}")
    @ResponseBody
    public Instituto buscarInstituto(@PathVariable int id){
        return insServ.buscarInstituto(id);
    }
}
