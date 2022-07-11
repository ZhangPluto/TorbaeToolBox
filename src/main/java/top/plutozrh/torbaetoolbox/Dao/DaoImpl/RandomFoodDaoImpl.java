package top.plutozrh.torbaetoolbox.Dao.DaoImpl;


/*
 * @program TorbaeToolBox
 *
 * @class RandomFoodDaoImpl
 *
 * @create Jul 10, 2022 03:48
 */

import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import top.plutozrh.torbaetoolbox.Dao.RandomFoodDao;
import top.plutozrh.torbaetoolbox.Model.Food;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Random;

/**
 * @author renhaozhang
 */
@Repository
public class RandomFoodDaoImpl implements RandomFoodDao, RowMapper<Food> {
    private final JdbcTemplate jdbcTemplate;
    private int getRandomNumber;
    private List<Food> randomFood;
    @Autowired
    public RandomFoodDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Food mapRow(ResultSet rs, int rowNum) throws SQLException {
        Food food = new Food();
        food.setAuthor(rs.getString("author"));
        food.setDosing(rs.getString("dosing"));
        food.setLink(rs.getString("link"));
        food.setName(rs.getString("name"));
        return food;
    }
    @Override
    public List<Food> getRandomFood() {
        try {
            String getMaxIdSql = "SELECT MAX(id) FROM food";
            RowMapper<Food> rowMapper = new BeanPropertyRowMapper<Food>(Food.class);
            Integer maxRowNumber = jdbcTemplate.queryForObject(getMaxIdSql,Integer.class);
            if (maxRowNumber != null){
                getRandomNumber = new Random().nextInt(maxRowNumber) + 1;
            }
            String getRandomFoodSql = "SELECT * FROM food where id=" + getRandomNumber;
            randomFood = jdbcTemplate.query(getRandomFoodSql,rowMapper);
        } catch (Exception e){
            System.err.println(e.toString());
        }
        return randomFood;
    }
}


