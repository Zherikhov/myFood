package ru.zherikhov.myfood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import ru.zherikhov.myfood.entity.Dish;
import ru.zherikhov.myfood.service.FoodService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DishRestController {

    @Qualifier("dishServiceImpl")
    @Autowired
    private FoodService foodService;

    @GetMapping("/dishes")
    public List<Dish> showAllDishes() {
        return foodService.getAll();
    }

    @GetMapping("/dish/{id}")
    public Dish getDish(@PathVariable int id) {
        return (Dish) foodService.getById(id);
    }

    @PostMapping("/dish")
    public Dish addNewDish(@RequestBody Dish dish) {
        foodService.save(dish);
        return dish;
    }

    @PutMapping("/dish")
    public Dish updateDish(@RequestBody Dish dish) {
        foodService.save(dish);
        return dish;
    }

    @DeleteMapping("/dish/delete/{id}")
    public String deleteDish(@PathVariable int id) {
        foodService.deleteById(id);
        return "[ Dish with ID = " + id + " was deleted ]";
    }
}
