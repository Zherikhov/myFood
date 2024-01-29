package ru.zherikhov.myfood.service;

import org.springframework.stereotype.Service;
import ru.zherikhov.myfood.dao.DishRepository;
import ru.zherikhov.myfood.entity.Dish;

import java.util.List;
import java.util.Optional;

@Service
public class DishService {

    private final DishRepository dishesRepository;

    public DishService(DishRepository dishesRepository) {
        this.dishesRepository = dishesRepository;
    }

    public List<Dish> getAll() {
        return dishesRepository.findAll();
    }

    public void save(Dish value) {
        dishesRepository.save(value);
    }

    public Dish getById(int id) {
        Dish dish = null;
        Optional<Dish> optionalDish = dishesRepository.findById(id);

        if (optionalDish.isPresent()) {
            dish = optionalDish.get();
        }
        return dish;
    }

    public void deleteById(int id) {
        dishesRepository.deleteById(id);
    }
}
