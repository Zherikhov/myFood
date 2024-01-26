package ru.zherikhov.myfood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import ru.zherikhov.myfood.entity.Ingredient;
import ru.zherikhov.myfood.entity.Recipe;
import ru.zherikhov.myfood.service.FoodService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RecipeRestController {

    private final FoodService foodService;

    public RecipeRestController(@Qualifier("recipeServiceImpl") FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping("/recipes")
    public List<Recipe> showAllRecipes() {
        return foodService.getAll();
    }

    @GetMapping("/recipe/{id}")
    public Recipe getRecipe(@PathVariable int id) {
        return (Recipe) foodService.getById(id);
    }

    @PostMapping("/recipe")
    public Recipe addNewRecipe(@RequestBody Recipe recipe) {
        foodService.save(recipe);
        return recipe;
    }

    @PutMapping("/recipe")
    public Recipe updateRecipe(@RequestBody Recipe recipe) {
        foodService.save(recipe);
        return recipe;
    }

    @DeleteMapping("/recipe/delete/{id}")
    public String deleteRecipe(@PathVariable int id) {
        foodService.deleteById(id);
        return "[ Recipe with ID = " + id + " was deleted ]";
    }
}
