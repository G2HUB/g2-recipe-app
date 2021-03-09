package guru.g2.recipeapp.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import lombok.extern.slf4j.Slf4j;

@DataJpaTest
@Slf4j
class UnitOfMeasureRepositoryTest {

	@Autowired
	UnitOfMeasureRepository unitOfMeasureRepository;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	//@DirtiesContext
	void testFindByDescription() {
		log.info("################# testFindByDescription         " );
		var uom =  unitOfMeasureRepository.findByDescription("Teaspoon");
		assertEquals("Teaspoon", uom.get().getDescription());
	}
	
	@Test
	void testFindByDescriptionCup() {
		var uom =  unitOfMeasureRepository.findByDescription("Cup");
		assertEquals("Cup", uom.get().getDescription());
	}

}
