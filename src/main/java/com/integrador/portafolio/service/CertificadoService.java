/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.integrador.portafolio.service;

import com.integrador.portafolio.entity.Certificado;
import com.integrador.portafolio.repository.CertificadoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CertificadoService implements ICertificadoService{
    @Autowired
    public CertificadoRepository cerRepo;

    @Override
    public List<Certificado> verCertificados() {
        return cerRepo.findAll();
    }

    @Override
    public void crearCertificado(Certificado cer) {
        cerRepo.save(cer);
    }

    @Override
    public void borrarCertificado(int id) {
        cerRepo.deleteById(id);
    }

    @Override
    public Certificado buscarCertificado(int id) {
        return cerRepo.findById(id).orElse(null);
    }

    @Override
    public void editarCertificado(Certificado cer) {
        cerRepo.save(cer);
    }
}
