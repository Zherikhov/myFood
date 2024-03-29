package ru.zherikhov.myfood.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "translate")
public class Translate {

    @Id
    @Column(name = "name_original")
    private String nameOriginal;

    @Column(name = "name_ru")
    private String nameRu;

    @Column(name = "name_en")
    private String nameEn;

    public Translate() { }
}
