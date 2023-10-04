package com.example.sistemaprueba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {
    
    @GetMapping(value = "/login")
    public String login(){
        return "login/login.html";
    }
}
