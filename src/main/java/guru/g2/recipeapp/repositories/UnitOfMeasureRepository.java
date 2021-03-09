package guru.g2.recipeapp.repositories;


import org.springframework.data.repository.CrudRepository;

import guru.g2.recipeapp.domain.UnitOfMeasure;

import java.util.Optional;

/**
 * Created by jt on 6/13/17.
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
