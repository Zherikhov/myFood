package ru.zherikhov.myfood.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zherikhov.myfood.entity.Dish;

public interface DishesRepository extends JpaRepository<Dish, Integer> {

}
