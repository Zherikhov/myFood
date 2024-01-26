package ru.zherikhov.myfood.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ingredients")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne
    @JoinColumn(name = "name_original")
    private Translate nameOriginal;

    @OneToOne(mappedBy = "ingredient")
    private RecipeToIngredient recipeToIngredient;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_type")
    private Type type;

    public Ingredient() { }
}
