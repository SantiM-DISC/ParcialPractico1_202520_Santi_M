package main.java.co.edu.uniandes.dse.ParcialPractico1_202520.repositories;

import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import co.edu.uniandes.dse.ParcialPractico1_202520.entities.PlanetaEntity;

@Repository

public interface SistemaSolarRepositoy extends JpaRepository<SistemaSolar, Long>{
    List<SistemaSolar> findByNombre(String nombre);
    List<SistemaSolar> findByGalaxia(String galaxia);
    List<SistemaSolar> findByRatio(int ratio);
    List<SistemaSolar> findByN_stormtroopers(int n_stormtroopers);
    
}