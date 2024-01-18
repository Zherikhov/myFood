package ru.zherikhov.myfood.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zherikhov.myfood.entity.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
}
