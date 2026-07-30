package com.example.mavenshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/member")
public class MemberController {

    @ResponseBody
    @GetMapping("/list")
    public String list() {
        return "member/list";
    }

    @ResponseBody
    @GetMapping("/detail")
    public String detail() {
        return "member/detail";
    }


}
