package com.projektbesler.food_recipes.modell;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("RECIPE")
public record Recipe(
    @Id
    Integer id,
    String title,
    String desc,
    Integer duration,
    LocalDateTime date_created,
    String steps
) {

}
