package ru.zherikhov.myfood.service;

import org.springframework.stereotype.Service;
import ru.zherikhov.myfood.dao.ComplexityRepository;
import ru.zherikhov.myfood.entity.Complexity;

import java.util.List;
import java.util.Optional;

@Service
public class ComplexityService {

    private final ComplexityRepository complexityRepository;

    public ComplexityService(ComplexityRepository complexityRepository) {
        this.complexityRepository = complexityRepository;
    }

    public List<Complexity> getAll() {
        return complexityRepository.findAll();
    }

    public void save(Complexity value) {
        complexityRepository.save(value);
    }

    public Complexity getById(int id) {
        Complexity complexity = null;
        Optional<Complexity> optionalComplexity = complexityRepository.findById(id);

        if (optionalComplexity.isPresent()) {
            complexity = optionalComplexity.get();
        }
        return complexity;
    }

    public void deleteById(int id) {
        complexityRepository.deleteById(id);
    }
}
