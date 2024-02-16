package com.senac.br.crud.simples.service;

import com.senac.br.crud.simples.dao.PessoaRepository;
import com.senac.br.crud.simples.model.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class PessoaCustomDetailsService implements UserDetailsService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Pessoa pessoa = pessoaRepository.findByEmail(username);
        if (pessoa == null) {
            return null;
        }
        return User.builder()
                .username(pessoa.getEmail())
                .password(pessoa.getSenha())
                .roles(pessoa.getRole().name())
                .build();
    }
}
