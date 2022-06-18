package top.plutozrh.torbaetoolbox.Controller;


/*
 * @program TorbaeToolBox
 *
 * @class IndexController
 *
 * @create Jun 04, 2022 19:25
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author renhaozhang
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String all(){
        return "index";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }


    @GetMapping("/tortorCoin")
    public String tortorCoin(Model model){
        model.addAttribute("name","小托");
        model.addAttribute("balance","5.0");
        model.addAttribute("friend","Pluto");
        return "tortorCoin";
    }

    @GetMapping("/logIn")
    public String logIn(){
        return "logIn";
    }

    @GetMapping("/signIn")
    public String signIn(){
        return "signIn";
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


}
