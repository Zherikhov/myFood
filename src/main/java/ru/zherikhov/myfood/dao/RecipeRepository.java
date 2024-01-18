package ru.zherikhov.myfood.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zherikhov.myfood.entity.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
}
