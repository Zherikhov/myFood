package ru.zherikhov.myfood.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import ru.zherikhov.myfood.entity.Translate;
import ru.zherikhov.myfood.service.TranslateService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TranslateRestController {

    private final TranslateService translateService;

    public TranslateRestController(@Qualifier("translateService") TranslateService foodService) {
        this.translateService = foodService;
    }

    @GetMapping("/translates")
    public List<Translate> showAllTranslates() {
        return translateService.getAll();
    }

    @GetMapping("/translate/{id}")
    public Translate getTranslate(@PathVariable int id) {
        return translateService.getById(id);
    }

    @PostMapping("/translate")
    public Translate addNewTranslate(@RequestBody Translate translate) {
        translateService.save(translate);
        return translate;
    }

    @PutMapping("/translate")
    public Translate updateTranslate(@RequestBody Translate translate) {
        translateService.save(translate);
        return translate;
    }

    @DeleteMapping("/translate/delete/{id}")
    public String deleteTranslate(@PathVariable int id) {
        translateService.deleteById(id);
        return "[ Translate with ID = " + id + " was deleted ]";
    }
}
