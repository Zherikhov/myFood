package ru.zherikhov.myfood.service;

import org.springframework.stereotype.Service;
import ru.zherikhov.myfood.dao.TypeRepository;
import ru.zherikhov.myfood.entity.Type;

import java.util.List;
import java.util.Optional;

@Service
public class TypeService {

    private final TypeRepository typeRepository;

    public TypeService(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }

    public List<Type> getAll() {
        return typeRepository.findAll();
    }

    public void save(Object type) {
        typeRepository.save((Type) type);
    }

    public Type getById(int id) {
        Type type = null;
        Optional<Type> optionalType = typeRepository.findById(id);

        if (optionalType.isPresent()) {
            type = optionalType.get();
        }
        return type;
    }

    public void deleteById(int id) {
        typeRepository.deleteById(id);
    }
}
