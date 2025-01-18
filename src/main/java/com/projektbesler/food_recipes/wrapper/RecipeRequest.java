package com.projektbesler.food_recipes.wrapper;

import org.springframework.stereotype.Component;

import com.projektbesler.food_recipes.modell.Nutritions;
import com.projektbesler.food_recipes.modell.Recipe;

import jakarta.validation.Valid;

@Component
public class RecipeRequest {
    @Valid
    private Recipe recipe;

    @Valid
    private Nutritions nutritions;

    public Recipe getRecipe() {
        return recipe;
    }

    public Nutritions getNutritions() {
        return nutritions;
    }
}
