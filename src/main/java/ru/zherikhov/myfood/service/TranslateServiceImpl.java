package ru.zherikhov.myfood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zherikhov.myfood.dao.TranslateRepository;
import ru.zherikhov.myfood.entity.Translate;

import java.util.List;
import java.util.Optional;

@Service
public class TranslateServiceImpl implements FoodService{

    @Autowired
    TranslateRepository translateRepository;

    @Override
    public List<Translate> getAll() {
        return translateRepository.findAll();
    }

    @Override
    public void save(Object value) {
        translateRepository.save((Translate) value);
    }

    @Override
    public Object getById(int id) {
        Translate translate = null;
        Optional<Translate> optionalTranslate = translateRepository.findById(id);

        if (optionalTranslate.isPresent()) {
            translate = optionalTranslate.get();
        }
        return translate;
    }

    @Override
    public void deleteById(int id) {
        translateRepository.deleteById(id);
    }
}
