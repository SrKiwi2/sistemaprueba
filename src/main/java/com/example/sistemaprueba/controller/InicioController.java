package com.example.sistemaprueba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {
    
    @GetMapping(value = "/login")
    public String login(){
        return "login/login.html";
    }

    @GetMapping(value = "/")
    public String inicio(){
        return "inicio/inicio.html";
    }

    @GetMapping(value = "/lockscreen")
    public String lockscreen(){
        return "login/lockscreen.html";
    }

    @GetMapping(value = "/registerLogin")
    public String register(){
        return "login/registerLogin.html";
    }

    @GetMapping(value = "/registerUsuario")
    public String Usuario(){
        return "formularios/formUsuario";
    }
}
