package ng.edu.binghamuni.project1.repository;

import ng.edu.binghamuni.inventory.Domain.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//CRUD FUNCTIONALITY HANDLED
public interface DrinkRepository extends JpaRepository<Drink,Long> {
//    @Query("")
//    List<Drink> findDrinkByPriceGreaterThan(int price);
}
