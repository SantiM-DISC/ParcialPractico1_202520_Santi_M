package co.edu.uniandes.dse.ParcialPractico1_202520.entities;

import jakarta.persistence.Entity;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.ManyToMany;
import uk.co.jemos.podam.common.PodamExclude;

@Data
@Entity
public class PlanetaEntity extends BaseEntity {
    private String nombre;
    private int poblacion;
    private double diametro;

    @PodamExclude
    @OneToOne
    private SistemaSolar sistemaSolar;
}
