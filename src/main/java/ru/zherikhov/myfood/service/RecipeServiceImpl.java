package ru.zherikhov.myfood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zherikhov.myfood.dao.RecipeRepository;
import ru.zherikhov.myfood.entity.Recipe;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeServiceImpl implements FoodService{

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public List<Recipe> getAll() {
        return recipeRepository.findAll();
    }

    @Override
    public void save(Object value) {
        recipeRepository.save((Recipe) value);
    }

    @Override
    public Object getById(int id) {
        Recipe recipe = null;
        Optional<Recipe> optionalRecipe = recipeRepository.findById(id);

        if (optionalRecipe.isPresent()) {
            recipe = optionalRecipe.get();
        }
        return recipe;
    }

    @Override
    public void deleteById(int id) {
        recipeRepository.deleteById(id);
    }
}
