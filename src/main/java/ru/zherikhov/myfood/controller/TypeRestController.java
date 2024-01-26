package ru.zherikhov.myfood.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import ru.zherikhov.myfood.entity.Type;
import ru.zherikhov.myfood.service.FoodService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TypeRestController {

    private final FoodService myService;

    public TypeRestController(@Qualifier("typeServiceImpl") FoodService myService) {
        this.myService = myService;
    }

    @GetMapping("/types")
    public List<Type> showAllDishes() {
        return myService.getAll();
    }

    @GetMapping("/type/{id}")
    public Type getType(@PathVariable int id) {
        return (Type) myService.getById(id);
    }

    @PostMapping("/type")
    public Type addNewType(@RequestBody Type type) {
        myService.save(type);
        return type;
    }

    @PutMapping("/type")
    public Type updateType(@RequestBody Type type) {
        myService.save(type);
        return type;
    }

    @DeleteMapping("/type/delete/{id}")
    public String deleteType(@PathVariable int id) {
        myService.deleteById(id);
        return "[ Type with ID = " + id + " was deleted ]";
    }
}
