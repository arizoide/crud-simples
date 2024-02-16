package com.senac.br.crud.simples.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String abrirIndex(){
        return "index";
    }

    @GetMapping("/login")
    public String getLoginPage() {
        return "login_page";
    }

    @GetMapping("/login-sucess")
    public String getLoginSucess() {
        return "login-sucess";
    }

    @GetMapping("/admin")
    public String getPaginaAdmin() {
        return "administrador";
    }

    @GetMapping("/user-comum")
    public String getPaginaComum() {
        return "comum";
    }

}
