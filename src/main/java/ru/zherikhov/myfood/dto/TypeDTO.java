package ru.zherikhov.myfood.dto;

import lombok.Getter;
import lombok.Setter;
import ru.zherikhov.myfood.entity.Type;

@Getter
@Setter
public class TypeDTO {
    private int id;
    private String nameOriginal;

    public static TypeDTO from(Type type) {
        TypeDTO typeDTO = new TypeDTO();
        typeDTO.id = type.getId();
        typeDTO.nameOriginal = type.getNameOriginal().getNameOriginal();

        return typeDTO;
    }
}
