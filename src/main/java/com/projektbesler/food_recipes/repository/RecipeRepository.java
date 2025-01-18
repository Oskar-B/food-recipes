package com.projektbesler.food_recipes.repository;
import org.springframework.data.repository.ListCrudRepository;

import com.projektbesler.food_recipes.modell.Recipe;

public interface RecipeRepository extends ListCrudRepository<Recipe, Integer>{

}
