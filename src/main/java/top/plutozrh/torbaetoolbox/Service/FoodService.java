package top.plutozrh.torbaetoolbox.Service;


import top.plutozrh.torbaetoolbox.Model.Food;

import java.util.List;

/**
 * @author renhaozhang
 */
public interface FoodService {
    /**
     * Get Random Food Service interface
     * @return Food
     */
    List<Food> getRandomFood();
}
