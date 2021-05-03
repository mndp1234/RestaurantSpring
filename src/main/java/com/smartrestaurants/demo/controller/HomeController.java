package com.smartrestaurants.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(Model m){
        m.addAttribute("title","pizzahut");
        return "home";
    }

}
