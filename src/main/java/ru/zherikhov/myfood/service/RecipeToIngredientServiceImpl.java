package ru.zherikhov.myfood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zherikhov.myfood.dao.RecipeToIngredientRepository;
import ru.zherikhov.myfood.entity.RecipeToIngredient;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeToIngredientServiceImpl implements FoodService{

    @Autowired
    RecipeToIngredientRepository recipeToIngredientRepository;

    @Override
    public List<RecipeToIngredient> getAll() {
        return recipeToIngredientRepository.findAll();
    }

    @Override
    public void save(Object value) {
        recipeToIngredientRepository.save((RecipeToIngredient) value);
    }

    @Override
    public Object getById(int id) {
        RecipeToIngredient recipeToIngredient = null;
        Optional<RecipeToIngredient> optionalRecipeToIngredient = recipeToIngredientRepository.findById(id);

        if (optionalRecipeToIngredient.isPresent()) {
            recipeToIngredient = optionalRecipeToIngredient.get();
        }
        return recipeToIngredient;
    }

    @Override
    public void deleteById(int id) {
        recipeToIngredientRepository.deleteById(id);
    }
}
