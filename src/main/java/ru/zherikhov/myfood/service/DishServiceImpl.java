//package ru.zherikhov.myfood.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import ru.zherikhov.myfood.dao.DishesRepository;
//import ru.zherikhov.myfood.entity.Dish;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class DishServiceImpl implements DishService{
//
//    @Autowired
//    private DishesRepository dishesRepository;
//
//    @Override
//    public List<Dish> getAllDishes() {
//        return dishesRepository.findAll();
//    }
//
//    @Override
//    public void saveDish(Dish dish) {
//        dishesRepository.save(dish);
//    }
//
//    @Override
//    public Dish getDish(int id) {
//        Dish dish = null;
//        Optional<Dish> optionalDish = dishesRepository.findById(id);
//
//        if (optionalDish.isPresent()) {
//            dish = optionalDish.get();
//        }
//        return dish;
//    }
//
//    @Override
//    public void deleteDish(int id) {
//        dishesRepository.deleteById(id);
//    }
//}
