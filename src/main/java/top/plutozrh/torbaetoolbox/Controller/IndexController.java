package top.plutozrh.torbaetoolbox.Controller;


/*
 * @program TorbaeToolBox
 *
 * @class IndexController
 *
 * @create Jun 04, 2022 19:25
 */

import org.springframework.stereotype.Controller;
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


    @GetMapping("/generic")
    public String generic(){
        return "generic";
    }

    @GetMapping("/elements")
    public String elements(){
        return "elements";
    }

    @RequestMapping("/logIn")
    public String logIn(){
        return "logIn";
    }

    @RequestMapping("/signIn")
    public String signIn(){
        return "signIn";
    }

}
