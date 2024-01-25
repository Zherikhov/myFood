package ru.zherikhov.myfood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import ru.zherikhov.myfood.entity.Dish;
import ru.zherikhov.myfood.entity.Translate;
import ru.zherikhov.myfood.service.FoodService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TranslateRestController {

    @Qualifier("translateServiceImpl")
    @Autowired
    private FoodService foodService;

    @GetMapping("/translates")
    public List<Translate> showAllTranslates() {
        return foodService.getAll();
    }

    @GetMapping("/translate/{id}")
    public Translate getTranslate(@PathVariable int id) {
        return (Translate) foodService.getById(id);
    }

    @PostMapping("/translate")
    public Translate addNewTranslate(@RequestBody Translate translate) {
        foodService.save(translate);
        return translate;
    }

    @PutMapping("/translate")
    public Translate updateTranslate(@RequestBody Translate translate) {
        foodService.save(translate);
        return translate;
    }

    @DeleteMapping("/translate/delete/{id}")
    public String deleteTranslate(@PathVariable int id) {
        foodService.deleteById(id);
        return "[ Translate with ID = " + id + " was deleted ]";
    }
}
