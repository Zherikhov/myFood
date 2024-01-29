package ru.zherikhov.myfood.service;

import org.springframework.stereotype.Service;
import ru.zherikhov.myfood.dao.RecipeRepository;
import ru.zherikhov.myfood.entity.Recipe;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public List<Recipe> getAll() {
        return recipeRepository.findAll();
    }

    public void save(Recipe value) {
        recipeRepository.save(value);
    }

    public Recipe getById(int id) {
        Recipe recipe = null;
        Optional<Recipe> optionalRecipe = recipeRepository.findById(id);

        if (optionalRecipe.isPresent()) {
            recipe = optionalRecipe.get();
        }
        return recipe;
    }

    public void deleteById(int id) {
        recipeRepository.deleteById(id);
    }
}
