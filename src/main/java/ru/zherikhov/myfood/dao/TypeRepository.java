package ru.zherikhov.myfood.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zherikhov.myfood.entity.Type;

public interface TypeRepository extends JpaRepository<Type, Integer> {
}
