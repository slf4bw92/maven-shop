package com.example.mavenshop.controller;

import com.example.mavenshop.domain.Member;
import com.example.mavenshop.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.util.List;


@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;

    @Value("${spring.datasource.url}")
    private String dbUrl;

    @PostConstruct
    public void init() {
        System.out.println("dbUrl = " + dbUrl);
    }


    @GetMapping("/list")
    public String list(Model model) {

        List<Member> members = memberService.findAll();
        System.out.println("members = " + members);

        model.addAttribute("members", members);

        return "member/memberList";
    }

    @ResponseBody
    @GetMapping("/detail")
    public String detail() {
        return "member/detail";
    }


}
