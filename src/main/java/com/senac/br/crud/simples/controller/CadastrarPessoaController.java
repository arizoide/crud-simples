package com.senac.br.crud.simples.controller;

import com.senac.br.crud.simples.dao.PessoaRepository;
import com.senac.br.crud.simples.model.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CadastrarPessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @PostMapping("/add_pessoa")
    public String addPessoa(Pessoa pessoa) {

        pessoaRepository.save(pessoa);

        return "index";
    }

}
