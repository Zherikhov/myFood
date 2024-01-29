package ru.zherikhov.myfood.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import ru.zherikhov.myfood.dto.ComplexityDTO;
import ru.zherikhov.myfood.entity.Complexity;
import ru.zherikhov.myfood.service.ComplexityService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ComplexityRestController {

    private final ComplexityService complexityService;

    public ComplexityRestController(@Qualifier("complexityService") ComplexityService foodService) {
        this.complexityService = foodService;
    }

    @GetMapping("/complexities")
    public List<ComplexityDTO> showAllComplexities() {
        return complexityService.getAll().stream().map(ComplexityDTO::from).toList();
    }

    @GetMapping("/complexity/{id}")
    public ComplexityDTO getComplexity(@PathVariable int id) {
        return ComplexityDTO.from(complexityService.getById(id));
    }

    @PostMapping("/complexity")
    public ComplexityDTO addNewComplexity(@RequestBody Complexity complexity) {
        complexityService.save(complexity);
        return ComplexityDTO.from(complexity);
    }

    @PutMapping("/complexity")
    public ComplexityDTO updateComplexity(@RequestBody Complexity complexity) {
        complexityService.save(complexity);
        return ComplexityDTO.from(complexity);
    }

    @DeleteMapping("/complexity/delete/{id}")
    public String deleteComplexity(@PathVariable int id) {
        complexityService.deleteById(id);
        return "[ Complexity with ID = " + id + " was deleted ]";
    }
}
