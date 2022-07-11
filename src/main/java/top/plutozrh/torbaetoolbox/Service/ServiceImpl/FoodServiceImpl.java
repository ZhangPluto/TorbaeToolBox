package top.plutozrh.torbaetoolbox.Service.ServiceImpl;


/*
 * @program TorbaeToolBox
 *
 * @class FoodServiceImpl
 *
 * @create Jul 10, 2022 01:54
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.plutozrh.torbaetoolbox.Dao.DaoImpl.RandomFoodDaoImpl;
import top.plutozrh.torbaetoolbox.Dao.RandomFoodDao;
import top.plutozrh.torbaetoolbox.Model.Food;
import top.plutozrh.torbaetoolbox.Service.FoodService;

import java.util.List;

/**
 * @author renhaozhang
 */
@Service
public class FoodServiceImpl implements FoodService {
    private final RandomFoodDaoImpl randomFoodDaoImpl;
    @Autowired
    public FoodServiceImpl(RandomFoodDaoImpl randomFoodDaoImpl) {
        this.randomFoodDaoImpl = randomFoodDaoImpl;
    }

    @Autowired


    @Override
    public List<Food> getRandomFood() {
        return randomFoodDaoImpl.getRandomFood();
    }
}
