package ru.zherikhov.myfood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zherikhov.myfood.dao.TypeRepository;
import ru.zherikhov.myfood.entity.Type;

import java.util.List;
import java.util.Optional;

@Service
public class TypeServiceImpl implements FoodService {

    @Autowired
    private TypeRepository typeRepository;

    @Override
    public List<Type> getAll() {
        return typeRepository.findAll();
    }

    @Override
    public void save(Object type) {
        typeRepository.save((Type) type);
    }

    @Override
    public Type getById(int id) {
        Type type = null;
        Optional<Type> optionalType = typeRepository.findById(id);

        if (optionalType.isPresent()) {
            type = optionalType.get();
        }
        return type;
    }

    @Override
    public void deleteById(int id) {
        typeRepository.deleteById(id);
    }
}
