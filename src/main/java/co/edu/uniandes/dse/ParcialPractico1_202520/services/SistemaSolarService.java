package main.java.co.edu.uniandes.dse.ParcialPractico1_202520.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import main.java.co.edu.uniandes.dse.ParcialPractico1_202520.entities.SistemaSolar;
import main.java.co.edu.uniandes.dse.ParcialPractico1_202520.repositories.SistemaSolarRepositoy;
import main.java.co.edu.uniandes.dse.ParcialPractico1_202520.exceptions.IllegalOperationException;
import java.util.List;
import java.util.Optional;

import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SistemaSolarService {
    @Autowired
    private SistemaSolarRepositoy sistemaSolarRepository;

    @Transactional
    public SistemaSolar createSistemaSolar(SistemaSolar sistemaSolar) throws IllegalOperationException {
        if (sistemaSolarRepository.findByNombre(sistemaSolar.getNombre().lenght > 31)) {
            throw new IllegalOperationException("El nombre del sistema solar no puede ser mayor a 31 caracteres");
        }
        if (sistemaSolar.getRatio() < 0.2 || sistemaSolar.getRatio() > 0.6) {
            throw new IllegalOperationException("El ratio del sistema solar debe estar entre 0.2 y 0.6");
        }
        if (sistemaSolar.getN_stormtroopers() < 1000) {
            throw new IllegalOperationException("El numero de stormtroopers del sistema solar debe ser mayor a 1000");
        }
    }
    
}
