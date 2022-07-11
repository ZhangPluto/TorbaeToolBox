package top.plutozrh.torbaetoolbox.Dao.DaoImpl;


/*
 * @program TorbaeToolBox
 *
 * @class RandomFoodDaoImpl
 *
 * @create Jul 10, 2022 03:48
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import top.plutozrh.torbaetoolbox.Dao.RandomFoodDao;
import top.plutozrh.torbaetoolbox.Model.Food;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author renhaozhang
 */
@Repository
public class RandomFoodDaoImpl implements RandomFoodDao, RowMapper<Food> {
    private final JdbcTemplate jdbcTemplate;

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
    public Food getRandomFood() {
        String sql = "SELECT * FROM FOOD WHERE ID=2";
        RowMapper<Food> rowMapper = new BeanPropertyRowMapper<Food>(Food.class);
        System.out.println(jdbcTemplate.query(sql,rowMapper));
        return new Food();
    }
}


