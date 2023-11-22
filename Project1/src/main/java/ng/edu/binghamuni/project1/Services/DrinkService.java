package ng.edu.binghamuni.project1.Services;

import ng.edu.binghamuni.project1.Domain.Drink;

import java.util.List;

public interface DrinkService {
Drink saveDrink(Drink drink);
Drink getDrinkById(long id);
List<Drink> getAllDrinks();
Drink updateDrink(Drink drink);
void deleteDrink(long id);
}
