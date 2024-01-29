package ru.zherikhov.myfood.dto;

import lombok.Getter;
import lombok.Setter;
import ru.zherikhov.myfood.entity.Complexity;

@Getter
@Setter
public class ComplexityDTO {
    private int id;
    private String nameOriginal;

    public static ComplexityDTO from (Complexity complexity) {
        ComplexityDTO complexityDTO = new ComplexityDTO();
        complexityDTO.id = complexity.getId();
        complexityDTO.nameOriginal = complexity.getNameOriginal().getNameOriginal();

        return complexityDTO;
    }
}
