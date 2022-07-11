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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import top.plutozrh.torbaetoolbox.Model.Food;
import top.plutozrh.torbaetoolbox.Service.ServiceImpl.FoodServiceImpl;

import java.util.List;
import java.util.Map;

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
    public String getRandomFood(Model model){
        Food ans = foodService.getRandomFood().get(0);
        model.addAttribute("foodName",ans.getName());
        model.addAttribute("foodAuthor",ans.getAuthor());
        model.addAttribute("foodDosing",ans.getDosing());
        model.addAttribute("foodLink",ans.getLink());
        return "randomFood::randomFoodPart";
    }
}
