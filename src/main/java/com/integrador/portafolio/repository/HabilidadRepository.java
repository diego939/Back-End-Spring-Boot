/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.integrador.portafolio.repository;

import com.integrador.portafolio.entity.Habilidad;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadRepository extends JpaRepository<Habilidad, Integer>{
    public void save(int id);
    
    @Query(
    value = "SELECT * FROM habilidad u WHERE u.tipo_habilidad_id = 1", 
    nativeQuery = true)
    public List<Habilidad> findHabilidades();
    
    @Query(
    value = "SELECT * FROM habilidad u WHERE u.tipo_habilidad_id = 2", 
    nativeQuery = true)
    public List<Habilidad> findTecnologias();
    
    
}
