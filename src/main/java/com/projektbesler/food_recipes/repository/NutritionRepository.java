package com.projektbesler.food_recipes.repository;
import org.springframework.data.repository.ListCrudRepository;

import com.projektbesler.food_recipes.modell.Nutritions;

public interface NutritionRepository extends ListCrudRepository<Nutritions, Integer>{

}
