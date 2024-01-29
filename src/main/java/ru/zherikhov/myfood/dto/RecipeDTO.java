package ru.zherikhov.myfood.dto;

import lombok.Getter;
import lombok.Setter;
import ru.zherikhov.myfood.entity.Recipe;

@Getter
@Setter
public class RecipeDTO {
    private int id;
    private int idDish;
    private String html;

    public static RecipeDTO from(Recipe recipe) {
        RecipeDTO recipeDTO = new RecipeDTO();
        recipeDTO.id = recipe.getId();
        recipeDTO.idDish = recipe.getDish().getId();
        recipeDTO.html = recipe.getDescription();

        return recipeDTO;
    }
}
