import main.co.edu.uniandes.dse.ParcialPractico1_202520.entities.PlanetaEntity;
import main.co.edu.uniandes.dse.ParcialPractico1_202520.repositories.PlanetaRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.Transactional;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@Transactional
@Import(ArbitroService.class)

public class PlanetaServiceTest {
    @Autowired
    private PlanetaService planetaService;

    private PodamFactory factory = new PodamFactoryImpl();
    private List<PlanetaEntity> planetaList = new ArrayList<>();

    @BeforeEach
    void setUp() {
        clearData();
        insertData();   
}
    private void clearData() {
        planetaRepository.deleteAll();
    }

    private void insertData() {
        for (int i = 0; i < 3; i++) {
            PlanetaEntity entity = factory.manufacturePojo(PlanetaEntity.class);
            entity.setId(null);
            planetaRepository.save(entity);
            planetaList.add(entity);
        }
    }

    @Test
    void testCreatePlaneta() throws IllegalOperationException {
        PlanetaEntity newEntity = factory.manufacturePojo(PlanetaEntity.class);
        PlanetaEntity result = planetaService.createPlaneta(newEntity);
        assertNotNull(result);
        PlanetaEntity entity = planetaRepository.findById(result.getId()).orElse(null);
        assertNotNull(entity);
        assertEquals(newEntity.getNombre(), entity.getNombre());
        assertEquals(newEntity.getPoblacion(), entity.getPoblacion());
        assertEquals(newEntity.getDiametro(), entity.getDiametro());
    }
}
