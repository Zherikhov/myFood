package ru.zherikhov.myfood.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "recipes_to_ingredients")
public class RecipeToIngredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_recipe", nullable = false)
    private Recipe recipe;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_ingredient")
    private Ingredient ingredient;

    @Column(name = "count", nullable = false)
    private int count;

    public RecipeToIngredient() { }
}
