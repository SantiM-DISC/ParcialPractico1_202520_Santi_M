package main.java.co.edu.uniandes.dse.ParcialPractico1_202520.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import main.java.co.edu.uniandes.dse.ParcialPractico1_202520.entities.PlanetaEntity;
import main.java.co.edu.uniandes.dse.ParcialPractico1_202520.repositories.PlanetaRepository;
import main.java.co.edu.uniandes.dse.ParcialPractico1_202520.exceptions.IllegalOperationException;
import java.util.List;
import java.util.Optional;

import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class PlanetaService {

    @Autowired
    private PlanetaRepository planetaRepository;

    @Transactional
    public PlanetaEntity createPlaneta(PlanetaEntity planeta) throws IllegalOperationException {
        if (planetaRepository.findByNombre(planeta.getNombre().isDifferent("I, II, III"))) {
            throw new IllegalOperationException("El nombre del planeta debe terminar en 'I, II, III'");  
        }
        if (planeta.getPoblacion() <= 0) {
            throw new IllegalOperationException("La poblacion del planeta no puede ser negativa o 0");}
        }
    }
        

