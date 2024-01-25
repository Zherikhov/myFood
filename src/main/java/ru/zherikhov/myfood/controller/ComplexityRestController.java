package ru.zherikhov.myfood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import ru.zherikhov.myfood.entity.Complexity;
import ru.zherikhov.myfood.entity.Translate;
import ru.zherikhov.myfood.service.FoodService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ComplexityRestController {

    @Qualifier("complexityServiceImpl")
    @Autowired
    private FoodService foodService;

    @GetMapping("/complexities")
    public List<Complexity> showAllComplexities() {
        return foodService.getAll();
    }

    @GetMapping("/complexity/{id}")
    public Complexity getComplexity(@PathVariable int id) {
        return (Complexity) foodService.getById(id);
    }

    @PostMapping("/complexity")
    public Complexity addNewComplexity(@RequestBody Complexity complexity) {
        foodService.save(complexity);
        return complexity;
    }

    @PutMapping("/complexity")
    public Complexity updateComplexity(@RequestBody Complexity complexity) {
        foodService.save(complexity);
        return complexity;
    }

    @DeleteMapping("/complexity/delete/{id}")
    public String deleteComplexity(@PathVariable int id) {
        foodService.deleteById(id);
        return "[ Complexity with ID = " + id + " was deleted ]";
    }
}
