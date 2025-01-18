package com.projektbesler.food_recipes;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.projektbesler.food_recipes.modell.Nutritions;
import com.projektbesler.food_recipes.modell.Recipe;
import com.projektbesler.food_recipes.repository.NutritionRepository;
import com.projektbesler.food_recipes.repository.RecipeRepository;


@SpringBootApplication
public class FoodRecipesApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodRecipesApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(RecipeRepository recipeRepository, NutritionRepository nutritionRepository) {
		return args -> {

			try (BufferedReader buffer = new BufferedReader(
				new InputStreamReader(this.getClass().getResourceAsStream("/RAW_recipes.csv"))))
				{
					List<String> lines = buffer.lines().skip(1).collect(Collectors.toList());
					for (String line : lines) {

						String[] fields = line.split(",");
						String title = fields[0];
						String desc = fields[9];
						Integer duration = Integer.parseInt(fields[2]);
						LocalDateTime date_created = LocalDateTime.parse(fields[4] + "T00:00:00");
						String steps = fields[8];
						
						Recipe recipe = new Recipe(null, title, desc, duration, date_created, steps);
						recipeRepository.save(recipe);

						String[] nutritions = fields[6].split(";");
						double calories = Double.parseDouble(nutritions[0]);
						double fat = Double.parseDouble(nutritions[1]);
						double sugar = Double.parseDouble(nutritions[2]);
						double sodium = Double.parseDouble(nutritions[3]);
						double protein = Double.parseDouble(nutritions[4]);

						Nutritions nutrition = new Nutritions(null, calories, fat, sugar, sodium, protein);
						nutritionRepository.save(nutrition);
					}
			}
		};
	}
	
}
