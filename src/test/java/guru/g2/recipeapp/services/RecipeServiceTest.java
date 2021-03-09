package guru.g2.recipeapp.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import guru.g2.recipeapp.domain.Recipe;
import guru.g2.recipeapp.repositories.RecipeRepository;

class RecipeServiceTest {

	RecipeService recipeService;
	
	@Mock
	RecipeRepository recipeRepository;
	
	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		recipeService= new RecipeService(recipeRepository);
	}

	@Test
	void testGetRecipes() {
		
		Set<Recipe> recipesData = Set.of(new Recipe()); 
		when(recipeRepository.findAll()).thenReturn(recipesData);
		
		var recipes 	= recipeService.getRecipes();
		assertEquals(1,recipes.size());
		verify(recipeRepository).findAll();
		verify(recipeRepository,never()).findById(1L);;
	}

}
