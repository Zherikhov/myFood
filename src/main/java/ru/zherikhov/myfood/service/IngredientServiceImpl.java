package ru.zherikhov.myfood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zherikhov.myfood.dao.IngredientRepository;
import ru.zherikhov.myfood.entity.Ingredient;

import java.util.List;
import java.util.Optional;

@Service
public class IngredientServiceImpl implements FoodService{

    private final IngredientRepository ingredientRepository;

    public IngredientServiceImpl(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public List<Ingredient> getAll() {
        return ingredientRepository.findAll();
    }

    @Override
    public void save(Object value) {
        ingredientRepository.save((Ingredient) value);
    }

    @Override
    public Object getById(int id) {
        Ingredient ingredient = null;
        Optional<Ingredient> optionalIngredient = ingredientRepository.findById(id);

        if (optionalIngredient.isPresent()) {
            ingredient = optionalIngredient.get();
        }
        return ingredient;
    }

    @Override
    public void deleteById(int id) {
        ingredientRepository.deleteById(id);
    }
}
