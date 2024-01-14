package ru.zherikhov.myfood.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "dishes")
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Getter
    @Setter
    private int id;

    @Column(name = "complexity")
    @Getter
    @Setter
    private int complexity;

    @Column(name = "name_original")
    @Getter
    @Setter
    private String nameOriginal;

//    @Column(name = "created")
//    @Getter
//    private String created;

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
