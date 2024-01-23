package ru.zherikhov.myfood.service;

import java.util.List;

public interface FoodService<T> {

    List<T> getAll();

    void save(T value);

    T getById(int id);

    void deleteById(int id);
}
