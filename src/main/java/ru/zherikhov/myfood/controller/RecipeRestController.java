package ru.zherikhov.myfood.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import ru.zherikhov.myfood.dto.RecipeDTO;
import ru.zherikhov.myfood.entity.Recipe;
import ru.zherikhov.myfood.service.RecipeService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RecipeRestController {

    private final RecipeService recipeService;

    public RecipeRestController(@Qualifier("recipeService") RecipeService foodService) {
        this.recipeService = foodService;
    }

    @GetMapping("/recipes")
    public List<RecipeDTO> showAllRecipes() {
        return recipeService.getAll().stream().map(RecipeDTO::from).toList();
    }

    @GetMapping("/recipe/{id}")
    public RecipeDTO getRecipe(@PathVariable int id) {
        return RecipeDTO.from(recipeService.getById(id));
    }

    @PostMapping("/recipe")
    public RecipeDTO addNewRecipe(@RequestBody Recipe recipe) {
        recipeService.save(recipe);
        return RecipeDTO.from(recipe);
    }

    @PutMapping("/recipe")
    public RecipeDTO updateRecipe(@RequestBody Recipe recipe) {
        recipeService.save(recipe);
        return RecipeDTO.from(recipe);
    }

    @DeleteMapping("/recipe/delete/{id}")
    public String deleteRecipe(@PathVariable int id) {
        recipeService.deleteById(id);
        return "[ Recipe with ID = " + id + " was deleted ]";
    }
}
