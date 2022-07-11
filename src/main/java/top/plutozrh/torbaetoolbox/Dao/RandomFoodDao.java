package top.plutozrh.torbaetoolbox.Dao;


import org.springframework.jdbc.core.JdbcTemplate;
import top.plutozrh.torbaetoolbox.Model.Food;

/**
 * @author renhaozhang
 */
public interface RandomFoodDao {
    /**
     * Gat food from database randomly
     * @return Food
     */
    Food getRandomFood();
}
