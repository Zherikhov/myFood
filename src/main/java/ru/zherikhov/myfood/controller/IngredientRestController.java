package ru.zherikhov.myfood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import ru.zherikhov.myfood.entity.Ingredient;
import ru.zherikhov.myfood.service.FoodService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class IngredientRestController {

    @Qualifier("ingredientServiceImpl")
    @Autowired
    private FoodService foodService;

    @GetMapping("/ingredients")
    public List<Ingredient> showAllIngredients() {
        return foodService.getAll();
    }

    @GetMapping("/ingredient/{id}")
    public Ingredient getIngredient(@PathVariable int id) {
        return (Ingredient) foodService.getById(id);
    }

    @PostMapping("/ingredient")
    public Ingredient addNewIngredient(@RequestBody Ingredient ingredient) {
        foodService.save(ingredient);
        return ingredient;
    }

    @PutMapping("/ingredient")
    public Ingredient updateIngredient(@RequestBody Ingredient ingredient) {
        foodService.save(ingredient);
        return ingredient;
    }

    @DeleteMapping("/ingredient/delete/{id}")
    public String deleteIngredient(@PathVariable int id) {
        foodService.deleteById(id);
        return "[ Ingredient with ID = " + id + " was deleted ]";
    }
}
