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

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_complexity")
    private Complexity complexity;
}
