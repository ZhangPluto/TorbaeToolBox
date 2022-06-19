package top.plutozrh.torbaetoolbox.Controller;


/*
 * @program TorbaeToolBox
 *
 * @class RandomController
 *
 * @create Jun 18, 2022 19:45
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author renhaozhang
 */
@Controller
public class RandomController {
    @GetMapping("/randomNumber/getAns")
    public ModelAndView requestRandomNumber(Model model, @RequestParam(value = "beginValue") String beginValue,
                                            @RequestParam(value = "endValue") String endValue,
                                            @RequestParam(value = "quantity") String quantity){
        return new ModelAndView("randomNumber::test");
    }

}
