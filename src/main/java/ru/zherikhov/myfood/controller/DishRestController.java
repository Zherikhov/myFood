package ru.zherikhov.myfood.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import ru.zherikhov.myfood.dto.DishDTO;
import ru.zherikhov.myfood.entity.Dish;
import ru.zherikhov.myfood.service.DishService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DishRestController {

    private final DishService dishService;

    public DishRestController(@Qualifier("dishService") DishService foodService) {
        this.dishService = foodService;
    }

    @GetMapping("/dishes")
    public List<DishDTO> showAllDishesDTO() {
        return dishService.getAll().stream().map(DishDTO::from).toList();
    }

    @GetMapping("/dish/{id}")
    public DishDTO getDish(@PathVariable int id) {
        return DishDTO.from(dishService.getById(id));
    }

    @PostMapping("/dish")
    public DishDTO addNewDish(@RequestBody Dish dish) {
        dishService.save(dish);
        return DishDTO.from(dish);
    }

    @PutMapping("/dish")
    public DishDTO updateDish(@RequestBody Dish dish) {
        dishService.save(dish);
        return DishDTO.from(dish);
    }

    @DeleteMapping("/dish/delete/{id}")
    public String deleteDish(@PathVariable int id) {
        dishService.deleteById(id);
        return "[ Dish with ID = " + id + " was deleted ]";
    }
}
