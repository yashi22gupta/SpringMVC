package com.yashi.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by yashi on 09-07-2017.
 */

@Controller
public class HomeController {

    @RequestMapping("/Register")
    public ModelAndView helloWorld() {
        return new ModelAndView("Register");
    }
}
