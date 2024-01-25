package ru.zherikhov.myfood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zherikhov.myfood.dao.DishRepository;
import ru.zherikhov.myfood.entity.Dish;

import java.util.List;
import java.util.Optional;

@Service
public class DishServiceImpl implements FoodService {

    @Autowired
    private DishRepository dishesRepository;

    @Override
    public List<Dish> getAll() {
        return dishesRepository.findAll();
    }

    @Override
    public void save(Object value) {
        dishesRepository.save((Dish) value);
    }

    @Override
    public Dish getById(int id) {
        Dish dish = null;
        Optional<Dish> optionalDish = dishesRepository.findById(id);

        if (optionalDish.isPresent()) {
            dish = optionalDish.get();
        }
        return dish;
    }

    @Override
    public void deleteById(int id) {
        dishesRepository.deleteById(id);
    }
}
