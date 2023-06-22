package com.example.tutorialcicd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/api/hello")
    @ResponseBody
    public String hello() {
        return "안녕하세요~~~";
    }

    @GetMapping("/api/hello2")
    @ResponseBody
    public String heelo2() {
        return "jenkins 자동 빌드 배포 테스트";
    }
}
