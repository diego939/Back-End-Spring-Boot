/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.integrador.portafolio.service;

import com.integrador.portafolio.entity.Certificado;
import java.util.List;


public interface ICertificadoService {
    public List <Certificado> verCertificados();
    public void crearCertificado(Certificado cer);
    public void borrarCertificado(int id);
    public Certificado buscarCertificado(int id);
    public void editarCertificado(Certificado cer);
}
