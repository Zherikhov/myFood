package ru.zherikhov.myfood.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "recipes")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "description", nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "id_dish", nullable = false)
    private Dish dish;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
    private List<RecipeToIngredient> recipeToIngredients;

    public Recipe() { }

}
