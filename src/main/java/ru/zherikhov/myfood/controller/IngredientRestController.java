package ru.zherikhov.myfood.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import ru.zherikhov.myfood.dto.IngredientDTO;
import ru.zherikhov.myfood.entity.Ingredient;
import ru.zherikhov.myfood.service.IngredientService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class IngredientRestController {

    private final IngredientService ingredientService;

    public IngredientRestController(@Qualifier("ingredientService") IngredientService foodService) {
        this.ingredientService = foodService;
    }

    @GetMapping("/ingredients")
    public List<IngredientDTO> showAllIngredients() {
        return ingredientService.getAll().stream().map(IngredientDTO::from).toList();
    }

    @GetMapping("/ingredient/{id}")
    public IngredientDTO getIngredient(@PathVariable int id) {
        return IngredientDTO.from(ingredientService.getById(id));
    }

    @PostMapping("/ingredient")
    public IngredientDTO addNewIngredient(@RequestBody Ingredient ingredient) {
        ingredientService.save(ingredient);
        return IngredientDTO.from(ingredient);
    }

    @PutMapping("/ingredient")
    public IngredientDTO updateIngredient(@RequestBody Ingredient ingredient) {
        ingredientService.save(ingredient);
        return IngredientDTO.from(ingredient);
    }

    @DeleteMapping("/ingredient/delete/{id}")
    public String deleteIngredient(@PathVariable int id) {
        ingredientService.deleteById(id);
        return "[ Ingredient with ID = " + id + " was deleted ]";
    }
}
