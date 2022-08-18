/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.integrador.portafolio.controller;


import com.integrador.portafolio.entity.Certificado;
import com.integrador.portafolio.service.ICertificadoService;
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
@RequestMapping("/certificado")
@CrossOrigin(origins = "*")
public class CertificadoController {
    @Autowired
    private ICertificadoService cerServ;
    
    List listaServicio = new ArrayList();
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new")
    public void agregarCertificado(@RequestBody Certificado cer){
        cerServ.crearCertificado(cer);
    }
    
    @GetMapping("/ver")
    @ResponseBody
    public List <Certificado> verCertificados(){
        return cerServ.verCertificados();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public void borrarCertificado(@PathVariable int id){
        cerServ.borrarCertificado(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar")
    public void editarCertificado(@RequestBody Certificado cer){
        cerServ.editarCertificado(cer);
    }
    
    @GetMapping("/buscar/{id}")
    @ResponseBody
    public Certificado buscarCertificado(@PathVariable int id){
        return cerServ.buscarCertificado(id);
    }
}
