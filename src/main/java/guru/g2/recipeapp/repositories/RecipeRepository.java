package guru.g2.recipeapp.repositories;


import org.springframework.data.repository.CrudRepository;

import guru.g2.recipeapp.domain.Recipe;

/**
 * Created by jt on 6/13/17.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
