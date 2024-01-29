package ru.zherikhov.myfood.service;

import org.springframework.stereotype.Service;
import ru.zherikhov.myfood.dao.RecipeToIngredientRepository;
import ru.zherikhov.myfood.entity.RecipeToIngredient;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeToIngredientService {

    private final RecipeToIngredientRepository recipeToIngredientRepository;

    public RecipeToIngredientService(RecipeToIngredientRepository recipeToIngredientRepository) {
        this.recipeToIngredientRepository = recipeToIngredientRepository;
    }

    public List<RecipeToIngredient> getAll() {
        return recipeToIngredientRepository.findAll();
    }

    public void save(RecipeToIngredient value) {
        recipeToIngredientRepository.save(value);
    }

    public RecipeToIngredient getById(int id) {
        RecipeToIngredient recipeToIngredient = null;
        Optional<RecipeToIngredient> optionalRecipeToIngredient = recipeToIngredientRepository.findById(id);

        if (optionalRecipeToIngredient.isPresent()) {
            recipeToIngredient = optionalRecipeToIngredient.get();
        }
        return recipeToIngredient;
    }

    public void deleteById(int id) {
        recipeToIngredientRepository.deleteById(id);
    }
}
