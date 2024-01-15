package ru.zherikhov.myfood.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "recipes_to_ingredients")
public class RecipeToIngredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "id_recipe")
    private int idRecipe;

    @Column(name = "id_ingredient")
    private int idIngredient;

    @Column(name = "count")
    private int count;
}
