package com.shubhamay.myprofile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    String getPeople(Model model) {
        model.addAttribute("something","This");
        return "home";
    }


    @GetMapping("/register")
    String getRegistration(Model model) {
        model.addAttribute("something","This");
        return "home";
    }
}
