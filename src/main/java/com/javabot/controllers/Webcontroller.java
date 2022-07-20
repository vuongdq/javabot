package com.javabot.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class Webcontroller {
    @GetMapping("/hello")
    public String adminPage(){
        return "admin";
    }
}
