package guru.g2.recipeapp.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngredientTest {

	Ingredient ingredient;
	
	@BeforeEach
	void setUp() throws Exception {
		ingredient = Ingredient.builder().description("testicule").amount(BigDecimal.valueOf(10D)).build();
	}

	

	@Test
	void testGetDescription() {
		assertEquals("testicule",ingredient.getDescription());
	}

	@Test
	void testGetAmount() {
		assertEquals(BigDecimal.valueOf(10D),ingredient.getAmount());
	}

}
