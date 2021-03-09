package guru.g2.recipeapp;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import guru.g2.recipeapp.domain.Difficulty;
import guru.g2.recipeapp.domain.Ingredient;
import guru.g2.recipeapp.domain.Notes;
import guru.g2.recipeapp.domain.Recipe;
import guru.g2.recipeapp.repositories.CategoryRepository;
import guru.g2.recipeapp.repositories.RecipeRepository;
import guru.g2.recipeapp.repositories.UnitOfMeasureRepository;

@Component
public class RecipeRunner implements CommandLineRunner{

	final private RecipeRepository recipeRepository;
	final private CategoryRepository categoryRepository;
	final private UnitOfMeasureRepository unitOfMeasureRepository;
	
	

	public RecipeRunner(RecipeRepository recipeRepository, CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
		super();
		this.recipeRepository = recipeRepository;
		this.categoryRepository = categoryRepository;
		this.unitOfMeasureRepository = unitOfMeasureRepository;
	}



	@Override
	@Transactional
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Recipe guacamole =Recipe.builder().description("Guacamole").cookTime(1000).prepTime(20000).difficulty(Difficulty.EASY)
			.build().addCategory( categoryRepository.findByDescription("Mexican").get())
			.addCategory( categoryRepository.findByDescription("Fast Food").get()).setNotes(new Notes("This is Guacamole"));
		
		guacamole.addIngredient(Ingredient.builder().recipe(guacamole).description("i1").amount(BigDecimal.valueOf(10))
				.uom(unitOfMeasureRepository.findByDescription("Teaspoon").get()).build());
	
		guacamole.addIngredient(Ingredient.builder().recipe(guacamole).description("i2").amount(BigDecimal.valueOf(10))
				.uom(unitOfMeasureRepository.findByDescription("Tablespoon").get()).build());
		
		guacamole.addIngredient(Ingredient.builder().recipe(guacamole).description("i3").amount(BigDecimal.valueOf(10))
				.uom(unitOfMeasureRepository.findByDescription("Cup").get()).build());
		
		recipeRepository.save(guacamole);
		
	}

}
