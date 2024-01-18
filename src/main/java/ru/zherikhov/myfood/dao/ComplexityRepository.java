package ru.zherikhov.myfood.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zherikhov.myfood.entity.Complexity;

public interface ComplexityRepository extends JpaRepository<Complexity, Integer> {
}
