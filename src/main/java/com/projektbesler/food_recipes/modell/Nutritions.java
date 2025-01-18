package com.projektbesler.food_recipes.modell;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("NUTRITIONS")
public record Nutritions(
    @Id
    Integer id,
    double calories,
    double fat,
    double sugar,
    double sodium,
    double protein
) {

}
