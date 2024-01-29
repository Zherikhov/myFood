package ru.zherikhov.myfood.dto;

import lombok.Getter;
import lombok.Setter;
import ru.zherikhov.myfood.entity.RecipeToIngredient;

@Getter
@Setter
public class RecipeToIngredientDTO {
    private int id;
    private int idRecipe;
    private String ingredient;
    private int count;
    private String type;

    public static RecipeToIngredientDTO from(RecipeToIngredient recipeToIngredient) {
        RecipeToIngredientDTO recipeToIngredientDTO = new RecipeToIngredientDTO();
        recipeToIngredientDTO.id = recipeToIngredient.getId();
        recipeToIngredientDTO.idRecipe = recipeToIngredient.getRecipe().getId();
        recipeToIngredientDTO.ingredient = recipeToIngredient.getIngredient().getNameOriginal().getNameOriginal();
        recipeToIngredientDTO.count = recipeToIngredient.getCount();
        recipeToIngredientDTO.type = recipeToIngredient.getIngredient().getType().getNameOriginal().getNameOriginal();

        return recipeToIngredientDTO;
    }
}
