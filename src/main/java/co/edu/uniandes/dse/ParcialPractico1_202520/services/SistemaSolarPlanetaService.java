package main.java.co.edu.uniandes.dse.ParcialPractico1_202520.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import main.java.co.edu.uniandes.dse.ParcialPractico1_202520.entities.SistemaSolar;
import main.java.co.edu.uniandes.dse.ParcialPractico1_202520.entities.PlanetaEntity;
import main.java.co.edu.uniandes.dse.ParcialPractico1_202520.repositories.SistemaSolarRepository;
import main.java.co.edu.uniandes.dse.ParcialPractico1_202520.repositories.PlanetaRepository;
import main.java.co.edu.uniandes.dse.ParcialPractico1_202520.exceptions.IllegalOperationException;
import java.util.List;
import java.util.Optional;


public class SistemaSolarPlanetaService {
    @Autowired
    private SistemaSolarRepository sistemaSolarRepository;
    @Autowired
    private PlanetaRepository planetaRepository;

    @Transactional
    public PlanetaEntity addPlanetaToSistemaSolar(Long sistemaSolarId, Long planetaId) throws IllegalOperationException {
        Optional<SistemaSolar> sistemaSolarOpt = sistemaSolarRepository.findById(sistemaSolarId);
        Optional<PlanetaEntity> planetaOpt = planetaRepository.findById(planetaId);
    
}}
