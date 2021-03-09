package guru.g2.recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.g2.recipeapp.services.RecipeService;

@Controller
public class RecipeController {
	public final RecipeService recipeService;

	public RecipeController(RecipeService recipeService) {
		super();
		this.recipeService = recipeService;
	}
	
	@RequestMapping({"recipe","recipes"})
	public String getRecipes(Model model) {
		
		model.addAttribute("recipes", recipeService.getRecipes());
		return "recipe/index";
		
	}
}
