package ru.zherikhov.myfood.dto;

import lombok.Getter;
import lombok.Setter;
import ru.zherikhov.myfood.entity.Ingredient;

@Getter
@Setter
public class IngredientDTO {
    private int id;
    private String type;
    private String nameOriginal;

    public static IngredientDTO from(Ingredient ingredient) {
        IngredientDTO ingredientDTO = new IngredientDTO();
        ingredientDTO.id = ingredient.getId();
        ingredientDTO.type = ingredient.getType().getNameOriginal().getNameOriginal();
        ingredientDTO.nameOriginal = ingredient.getNameOriginal().getNameOriginal();

        return ingredientDTO;
    }
}
