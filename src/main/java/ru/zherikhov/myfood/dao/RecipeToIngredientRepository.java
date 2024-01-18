package ru.zherikhov.myfood.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zherikhov.myfood.entity.RecipeToIngredient;

public interface RecipeToIngredientRepository extends JpaRepository<RecipeToIngredient, Integer> {
}
