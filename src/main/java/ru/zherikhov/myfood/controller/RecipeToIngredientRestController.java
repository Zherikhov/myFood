package ru.zherikhov.myfood.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import ru.zherikhov.myfood.dto.RecipeToIngredientDTO;
import ru.zherikhov.myfood.entity.RecipeToIngredient;
import ru.zherikhov.myfood.service.RecipeToIngredientService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RecipeToIngredientRestController {

    private final RecipeToIngredientService recipeToIngredientService;

    public RecipeToIngredientRestController(@Qualifier("recipeToIngredientService") RecipeToIngredientService foodService) {
        this.recipeToIngredientService = foodService;
    }

    @GetMapping("/recipeToIngredients")
    public List<RecipeToIngredientDTO> showAllRecipeToIngredients() {
        return recipeToIngredientService.getAll().stream().map(RecipeToIngredientDTO::from).toList();
    }

    @GetMapping("/recipeToIngredient/{id}")
    public RecipeToIngredientDTO getRecipeToIngredient(@PathVariable int id) {
        return RecipeToIngredientDTO.from(recipeToIngredientService.getById(id));
    }

    @PostMapping("/recipeToIngredient")
    public RecipeToIngredientDTO addNewRecipeToIngredient(@RequestBody RecipeToIngredient recipeToIngredient) {
        recipeToIngredientService.save(recipeToIngredient);
        return RecipeToIngredientDTO.from(recipeToIngredient);
    }

    @PutMapping("/recipeToIngredient")
    public RecipeToIngredientDTO updateRecipeToIngredient(@RequestBody RecipeToIngredient recipeToIngredient) {
        recipeToIngredientService.save(recipeToIngredient);
        return RecipeToIngredientDTO.from(recipeToIngredient);
    }

    @DeleteMapping("/recipeToIngredient/delete/{id}")
    public String deleteRecipe(@PathVariable int id) {
        recipeToIngredientService.deleteById(id);
        return "[ RecipeToIngredient with ID = " + id + " was deleted ]";
    }
}
