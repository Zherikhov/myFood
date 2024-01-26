package ru.zherikhov.myfood.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import ru.zherikhov.myfood.entity.RecipeToIngredient;
import ru.zherikhov.myfood.service.FoodService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RecipeToIngredientRestController {

    private final FoodService foodService;

    public RecipeToIngredientRestController(@Qualifier("recipeToIngredientServiceImpl") FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping("/recipeToIngredients")
    public List<RecipeToIngredient> showAllRecipeToIngredients() {
        return foodService.getAll();
    }

    @GetMapping("/recipeToIngredient/{id}")
    public RecipeToIngredient getRecipeToIngredient(@PathVariable int id) {
        return (RecipeToIngredient) foodService.getById(id);
    }

    @PostMapping("/recipeToIngredient")
    public RecipeToIngredient addNewRecipeToIngredient(@RequestBody RecipeToIngredient recipeToIngredient) {
        foodService.save(recipeToIngredient);
        return recipeToIngredient;
    }

    @PutMapping("/recipeToIngredient")
    public RecipeToIngredient updateRecipeToIngredient(@RequestBody RecipeToIngredient recipeToIngredient) {
        foodService.save(recipeToIngredient);
        return recipeToIngredient;
    }

    @DeleteMapping("/recipeToIngredient/delete/{id}")
    public String deleteRecipe(@PathVariable int id) {
        foodService.deleteById(id);
        return "[ RecipeToIngredient with ID = " + id + " was deleted ]";
    }
}
