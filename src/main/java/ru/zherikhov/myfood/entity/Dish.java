package ru.zherikhov.myfood.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "dishes")
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "complexity")
    private int complexity;

    @Column(name = "name_original")
    private String nameOriginal;

//    @Column(name = "created")
//    @Getter
//    private String created;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_dish")
    private Recipe recipe;

    public Dish() {
    }

    public Dish(int complexity, String nameOriginal) {
        this.complexity = complexity;
        this.nameOriginal = nameOriginal;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", complexity=" + complexity +
                ", nameOriginal='" + nameOriginal + '\'' +
//                ", created='" + created + '\'' +
                '}';
    }
}
