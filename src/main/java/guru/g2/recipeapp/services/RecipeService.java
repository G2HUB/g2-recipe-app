package guru.g2.recipeapp.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import guru.g2.recipeapp.domain.Recipe;
import guru.g2.recipeapp.repositories.RecipeRepository;

@Service
public class RecipeService {

	final private RecipeRepository recipeRepository;

	public RecipeService(RecipeRepository recipeRepository) {
		super();
		this.recipeRepository = recipeRepository;
	}
	
	public Set<Recipe> getRecipes(){
		Set<Recipe> recipes = new HashSet<>();
		recipeRepository.findAll().forEach(recipes::add);
		return recipes;
	}
}
