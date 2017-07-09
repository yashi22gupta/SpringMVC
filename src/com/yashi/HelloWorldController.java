package com.yashi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by yashi on 08-07-2017.
 */
@Controller
public class HelloWorldController {
    @RequestMapping("/hello")
    public ModelAndView helloWorld() {
        String message = "HELLO SPRING MVC HOW R U";
        return new ModelAndView("HelloPage", "message", message);
    }
}