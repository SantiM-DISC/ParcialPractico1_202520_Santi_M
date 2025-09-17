package co.edu.uniandes.dse.ParcialPractico1_202520.entities;
import jakarta.persistence.Entity;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.ManyToMany;
import uk.co.jemos.podam.common.PodamExclude;

@Data
@Entity
public class SistemaSolar extends BaseEntity {

    private String nombre;
    private String galaxia;
    private int ratio;
    private int n_stormtroopers;
    @PodamExclude
    @OneToMany(mappedBy = "planetas")
    private List<PlanetaEntity> planetas = new ArrayList<>();

    
}
