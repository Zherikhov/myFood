package ru.zherikhov.myfood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.zherikhov.myfood.entity.Type;
import ru.zherikhov.myfood.service.FoodService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TypeRestController {

    @Qualifier("typeServiceImpl")
    @Autowired
    private FoodService myService;

    @GetMapping("/types")
    public List<Type> showAllDishes() {
        return myService.getAll();
    }
}
