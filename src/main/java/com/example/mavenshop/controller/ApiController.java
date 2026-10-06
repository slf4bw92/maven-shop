package com.example.mavenshop.controller;

import com.example.mavenshop.domain.PopupVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApiController {

    @ResponseBody
    @PostMapping("/api/testNull")
    public String testNull(@RequestBody PopupVo popupVo) {
        System.out.println("popupVo = " + popupVo);

        return "testNull";
    }
}
