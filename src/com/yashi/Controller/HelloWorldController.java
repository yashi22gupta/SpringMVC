package com.yashi.Controller;

import com.yashi.Modal.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.multipart.support.AbstractMultipartHttpServletRequest;
import org.springframework.web.servlet.HttpServletBean;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by yashi on 08-07-2017.
 */
@Controller
public class HelloWorldController{
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

   @RequestMapping(value = "/register",method = RequestMethod.POST)
       public ModelAndView showform () {
           return new ModelAndView("Register", "userForm", new User());
       }

    @RequestMapping(value="/save",method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("userForm") User emp){
        //write code to save emp object
        System.out.println(emp.getFname()+" "+emp.getLname()+" ");

        //return new ModelAndView("empform","command",emp);
        return new ModelAndView("redirect:/index");
    }


       /* @RequestMapping(value = "/",method = RequestMethod.GET)
        public String viewRegistration(Model model) {
            User userForm = new User();
            model.addAttribute("userForm",userForm);
            return "index";
        }

    @RequestMapping(method = RequestMethod.POST)
    public String submit(@ModelAttribute("userForm")User user,
                         BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }


        model.addAttribute("user", new User());
       *//* model.addAttribute("name", user.getUsername());
        model.addAttribute("contactNumber", user.getPassword());*//*
        return "index";
    }*/
    }