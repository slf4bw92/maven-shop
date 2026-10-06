package com.example.mavenshop.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@Controller
public class HomeController {

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @PostConstruct
    public void init() {
        log.info("===== test =====");
        log.info("url = " + url);
        log.info("username = " + username);
        log.info("password = " + password);
        log.info("===== test finish =====");

    }

    @GetMapping("/")
    public String home(HttpServletRequest request, HttpServletResponse response) {
        log.info("request URL: {} ", request.getRequestURL().toString());
        log.info("this is new data");
        Cookie themeCookie = new Cookie("theme", "dark");
        themeCookie.setPath("/");
        response.addCookie(themeCookie);
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

    @GetMapping("/moveNaver")
    public String moveNaver() {

        // 브라우저에게 네이버 주소로 이동하라는 302 응답을 보냅니다.
        return "redirect:https://www.naver.com";
    }

    @GetMapping("/testNull")
    public String testNull() {
        return "testNull";
    }

    @ResponseBody
    @GetMapping("/tomcat-manager")
    public void tomcatManager() {
        log.info("tomcat-manager");
    }
}
