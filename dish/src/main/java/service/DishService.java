package service;

import model.Dish;

import java.util.List;
import java.util.Optional;

public interface DishService {
    void saveDish(Dish dish);
    void deleteDish(Dish dish);
    Optional<Dish> findById(int id);
    Optional<Dish> findByName(String name);
    Optional<Dish> findByPrice(Double price);
    List<Dish> findAll();
}
