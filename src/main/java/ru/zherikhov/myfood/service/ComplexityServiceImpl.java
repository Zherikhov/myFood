package ru.zherikhov.myfood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zherikhov.myfood.dao.ComplexityRepository;
import ru.zherikhov.myfood.entity.Complexity;

import java.util.List;
import java.util.Optional;

@Service
public class ComplexityServiceImpl implements FoodService{

    private final ComplexityRepository complexityRepository;

    public ComplexityServiceImpl(ComplexityRepository complexityRepository) {
        this.complexityRepository = complexityRepository;
    }

    @Override
    public List<Complexity> getAll() {
        return complexityRepository.findAll();
    }

    @Override
    public void save(Object value) {
        complexityRepository.save((Complexity) value);
    }

    @Override
    public Object getById(int id) {
        Complexity complexity = null;
        Optional<Complexity> optionalComplexity = complexityRepository.findById(id);

        if (optionalComplexity.isPresent()) {
            complexity = optionalComplexity.get();
        }
        return complexity;
    }

    @Override
    public void deleteById(int id) {
        complexityRepository.deleteById(id);
    }
}
