package main.java.co.edu.uniandes.dse.ParcialPractico1_202520.repositories;

import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import co.edu.uniandes.dse.ParcialPractico1_202520.entities.PlanetaEntity;

@Repository
public interface PlanetaRepository extends JpaRepository<PlanetaEntity, Long>{
    List<PlanetaEntity> findByNombre(String nombre);
    List<PlanetaEntity> findByPoblacion(int poblacion);
    List<PlanetaEntity> findByDiametro(double diametro);
    

}
