package ru.zherikhov.myfood.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zherikhov.myfood.entity.Translate;

public interface TranslateRepository extends JpaRepository<Translate, Integer> {
}
