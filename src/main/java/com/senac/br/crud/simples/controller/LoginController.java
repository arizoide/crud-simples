package com.senac.br.crud.simples.controller;

import com.senac.br.crud.simples.dao.PessoaRepository;
import com.senac.br.crud.simples.dto.LoginDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @PostMapping("/entrar")
    public String login(LoginDTO loginDTO){
        //Valida se usuário está na base
        boolean existe = pessoaRepository.existsByEmailAndSenha(loginDTO.getEmail(), loginDTO.getSenha());

        if(existe){
            return "login-sucess";
        } else {
            return "login-failed";
        }
    }

}
