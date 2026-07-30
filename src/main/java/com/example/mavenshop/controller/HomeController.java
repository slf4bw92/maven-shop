package com.example.mavenshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @ResponseBody
    @GetMapping("/worker1")
    public String worker1() {
        return "Hello Worker1";
    }

    @PostMapping("/member/search")
    public String memberSearch(String name, String age, Model model) {
        System.out.println("name : " + name + ", age : " + age);
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "member/search";
    }
}
