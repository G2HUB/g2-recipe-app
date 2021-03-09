package guru.g2.recipeapp.repositories;


import org.springframework.data.repository.CrudRepository;

import guru.g2.recipeapp.domain.Category;

import java.util.Optional;

/**
 * Created by jt on 6/13/17.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
