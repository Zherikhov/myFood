package ru.zherikhov.myfood.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import ru.zherikhov.myfood.dto.TypeDTO;
import ru.zherikhov.myfood.entity.Type;
import ru.zherikhov.myfood.service.TypeService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TypeRestController {

    private final TypeService translateService;

    public TypeRestController(@Qualifier("typeService") TypeService myService) {
        this.translateService = myService;
    }

    @GetMapping("/types")
    public List<TypeDTO> showAllDishes() {
        return translateService.getAll().stream().map(TypeDTO::from).toList();
    }

    @GetMapping("/type/{id}")
    public TypeDTO getType(@PathVariable int id) {
        return TypeDTO.from(translateService.getById(id));
    }

    @PostMapping("/type")
    public TypeDTO addNewType(@RequestBody Type type) {
        translateService.save(type);
        return TypeDTO.from(type);
    }

    @PutMapping("/type")
    public TypeDTO updateType(@RequestBody Type type) {
        translateService.save(type);
        return TypeDTO.from(type);
    }

    @DeleteMapping("/type/delete/{id}")
    public String deleteType(@PathVariable int id) {
        translateService.deleteById(id);
        return "[ Type with ID = " + id + " was deleted ]";
    }
}
