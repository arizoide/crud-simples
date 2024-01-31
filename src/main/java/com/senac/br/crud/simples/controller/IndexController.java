package com.senac.br.crud.simples.controller;

import com.senac.br.crud.simples.dto.LoginDTO;
import com.senac.br.crud.simples.model.Pessoa;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String abrirIndex(LoginDTO login){
        return "index";
    }

}
