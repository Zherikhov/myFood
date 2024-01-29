package ru.zherikhov.myfood.service;

import org.springframework.stereotype.Service;
import ru.zherikhov.myfood.dao.TranslateRepository;
import ru.zherikhov.myfood.entity.Translate;

import java.util.List;
import java.util.Optional;

@Service
public class TranslateService {

    private final TranslateRepository translateRepository;

    public TranslateService(TranslateRepository translateRepository) {
        this.translateRepository = translateRepository;
    }

    public List<Translate> getAll() {
        return translateRepository.findAll();
    }

    public void save(Translate value) {
        translateRepository.save(value);
    }

    public Translate getById(int id) {
        Translate translate = null;
        Optional<Translate> optionalTranslate = translateRepository.findById(id);

        if (optionalTranslate.isPresent()) {
            translate = optionalTranslate.get();
        }
        return translate;
    }

    public void deleteById(int id) {
        translateRepository.deleteById(id);
    }
}
