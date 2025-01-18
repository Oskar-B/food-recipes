package com.projektbesler.food_recipes.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.projektbesler.food_recipes.modell.Recipe;
import com.projektbesler.food_recipes.repository.NutritionRepository;
import com.projektbesler.food_recipes.repository.RecipeRepository;
import com.projektbesler.food_recipes.wrapper.RecipeRequest;

import jakarta.validation.Valid;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/api/recipe")
public class RecipeController {

    RecipeRepository recipeRepository;
    NutritionRepository nutritionRepository;

    RecipeController(RecipeRepository recipeRepository, NutritionRepository nutritionRepository) {
        this.recipeRepository = recipeRepository;
        this.nutritionRepository = nutritionRepository;
    }

    @GetMapping("")
    public List<Recipe> findAll() {
        return recipeRepository.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void create(@Valid @RequestBody RecipeRequest recipeRequest) {
        recipeRepository.save(recipeRequest.getRecipe());
        nutritionRepository.save(recipeRequest.getNutritions());
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void update(@PathVariable Integer id, @Valid @RequestBody RecipeRequest recipeRequest) {
        if (!recipeRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Recipe not found!");
        }
        recipeRepository.save(recipeRequest.getRecipe());
        nutritionRepository.save(recipeRequest.getNutritions());

    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteMethodName(@PathVariable Integer id) {
        if (recipeRepository.existsById(id)) {
            recipeRepository.deleteById(id);
            nutritionRepository.deleteById(id);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Recipe not found!");
        }
    }
    

}
