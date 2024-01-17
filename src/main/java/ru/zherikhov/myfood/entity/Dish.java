package ru.zherikhov.myfood.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "dishes")
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne
    @JoinColumn(name = "name_original")
    private Translate nameOriginal;

    @Column(name = "created", nullable = false)
    private Timestamp created;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dish")
    private List<Recipe> recipes;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_complexity")
    private Complexity complexity;

    public Dish() {
    }

    public void addRecipeToDish(Recipe recipe) {
        if (recipes == null) {
            recipes = new ArrayList<>();
        } else {
            recipes.add(recipe);
            recipe.setDish(this);
        }
    }

    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", complexity=" + complexity +
                ", nameOriginal='" + nameOriginal + '\'' +
                '}';
    }
}
