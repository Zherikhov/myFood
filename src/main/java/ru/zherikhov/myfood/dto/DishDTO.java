package ru.zherikhov.myfood.dto;

import lombok.Getter;
import lombok.Setter;
import ru.zherikhov.myfood.entity.Dish;

@Getter
@Setter
public class DishDTO {
    private int id;
    private String nameOriginal;
    private String complexity;

    public static DishDTO from(Dish dish) {
        DishDTO dishDTO = new DishDTO();
        dishDTO.id = dish.getId();
        dishDTO.nameOriginal = dish.getNameOriginal().getNameOriginal();
        dishDTO.complexity = dish.getComplexity().getNameOriginal().getNameOriginal();

        return dishDTO;
    }
}
