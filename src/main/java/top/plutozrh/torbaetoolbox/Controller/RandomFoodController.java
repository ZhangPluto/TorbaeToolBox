package top.plutozrh.torbaetoolbox.Controller;


/*
 * @program TorbaeToolBox
 *
 * @class RandomFoodController
 *
 * @create Jul 09, 2022 23:31
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import top.plutozrh.torbaetoolbox.Service.ServiceImpl.FoodServiceImpl;

/**
 * @author renhaozhang
 */
@Controller
public class RandomFoodController {

    private final FoodServiceImpl foodService;
    @Autowired
    public RandomFoodController(FoodServiceImpl foodService) {
        this.foodService = foodService;
    }

    @GetMapping("/randomNumber")
    public String randomNumber(){
        return "randomNumber";
    }
    @GetMapping("/randomFood")
    public String randomFood(){
        return "randomFood";
    }
    @GetMapping("/randomElement")
    public String randomElement(){
        return "randomElement";
    }

    @RequestMapping("/randomFood/getRandomFood")
    public String getRandomFood(){
        foodService.getRandomFood();
        return "icu";
    }
}
