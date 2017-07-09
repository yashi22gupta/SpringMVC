package com.yashi.Controller;

import com.yashi.Modal.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by yashi on 08-07-2017.
 */
@Controller
@RequestMapping(value = "/RegisterUser")
public class HelloWorldController {
    /*@RequestMapping("/hello")
    public ModelAndView helloWorld() {
        String message = "HELLO SPRING MVC HOW R U";
        return new ModelAndView("HelloPage", "message", message);
    }*/

   /* @RequestMapping("/Register")
    public ModelAndView helloWorld() {
        String message = "HELLO SPRING MVC HOW R U";
        return new ModelAndView("Register", "message", message);
    }*/

        @RequestMapping(method = RequestMethod.GET)
        public String viewRegistration(Map<String, Object> model) {
            User userForm = new User();
            model.put("userForm", userForm);

            return "HelloPage";
        }

        @RequestMapping(method = RequestMethod.POST)
        public String processRegistration(@ModelAttribute("userForm") User user,
                                          Map<String, Object> model) {

            // implement your own registration logic here...

            // for testing purpose:
            System.out.println("username: " + user.getUsername());
            System.out.println("password: " + user.getPassword());
            System.out.println("email: " + user.getEmail());

            return ("HelloPage");
        }
    }