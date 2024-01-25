package com.senac.br.crud.simples.controller;

import com.senac.br.crud.simples.model.Pessoa;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/cad_pessoa")
    public String abrirCadastroPessoa(Pessoa pessoa){
        return "cadastro_pessoa";
    }

}
