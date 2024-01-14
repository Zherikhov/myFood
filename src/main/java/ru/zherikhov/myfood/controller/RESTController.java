//package ru.zherikhov.myfood.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import ru.zherikhov.myfood.entity.Dish;
//import ru.zherikhov.myfood.service.DishService;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api")
//public class RESTController {
//
//    @Autowired
//    private DishService  dishService;
//
//    @GetMapping("/dishes")
//    public List<Dish> showAllDishes() {
//        return dishService.getAllDishes();
//    }
//
//    @GetMapping("/dish/{id}")
//    public Dish getDish(@PathVariable int id) {
//        return dishService.getDish(id);
//    }
//
//    @PostMapping("/dish")
//    public Dish addNewDish(@RequestBody Dish dish) {
//        dishService.saveDish(dish);
//        return dish;
//    }
//
//    @PutMapping("/dish")
//    public Dish updateDish(@RequestBody Dish dish) {
//        dishService.saveDish(dish);
//        return dish;
//    }
//
//    @DeleteMapping("/dish/delete/{id}")
//    public String deleteDish(@PathVariable int id) {
//        dishService.deleteDish(id);
//        return "{Dish with ID = " + id + " was deleted}";
//    }
//}
