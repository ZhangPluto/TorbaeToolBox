package top.plutozrh.torbaetoolbox.Dao;


import org.springframework.jdbc.core.JdbcTemplate;
import top.plutozrh.torbaetoolbox.Model.Food;

import java.util.List;

/**
 * @author renhaozhang
 */
public interface RandomFoodDao {
    /**
     * Gat food from database randomly
     * @return Food
     */
    List<Food> getRandomFood();
}
