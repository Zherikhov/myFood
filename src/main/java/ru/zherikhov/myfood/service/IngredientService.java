package ru.zherikhov.myfood.service;

import org.springframework.stereotype.Service;
import ru.zherikhov.myfood.dao.IngredientRepository;
import ru.zherikhov.myfood.entity.Ingredient;

import java.util.List;
import java.util.Optional;

@Service
public class IngredientService {

    private final IngredientRepository ingredientRepository;

    public IngredientService(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    public List<Ingredient> getAll() {
        return ingredientRepository.findAll();
    }

    public void save(Ingredient value) {
        ingredientRepository.save(value);
    }

    public Ingredient getById(int id) {
        Ingredient ingredient = null;
        Optional<Ingredient> optionalIngredient = ingredientRepository.findById(id);

        if (optionalIngredient.isPresent()) {
            ingredient = optionalIngredient.get();
        }
        return ingredient;
    }

    public void deleteById(int id) {
        ingredientRepository.deleteById(id);
    }
}
