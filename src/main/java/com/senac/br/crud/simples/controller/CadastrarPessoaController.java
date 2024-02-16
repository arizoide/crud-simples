package com.senac.br.crud.simples.controller;

import com.senac.br.crud.simples.dao.PessoaRepository;
import com.senac.br.crud.simples.model.Pessoa;
import com.senac.br.crud.simples.model.RoleEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CadastrarPessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping("/cad_pessoa")
    public String abrirCadastroPessoa(Pessoa pessoa){
        return "cadastro_pessoa";
    }

    @PostMapping("/add_pessoa")
    public String addPessoa(Pessoa pessoa) {

        BCryptPasswordEncoder crypt = new BCryptPasswordEncoder();

        pessoa.setSenha(crypt.encode(pessoa.getSenha()));
        pessoa.setRole(RoleEnum.USER);

        pessoaRepository.save(pessoa);

        return "index";
    }

}
