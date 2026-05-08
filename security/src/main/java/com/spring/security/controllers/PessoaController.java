package com.spring.security.controllers;


import com.spring.security.models.PessoaModel;
import com.spring.security.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/pessoas")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping
    public List<PessoaModel> findall() {
        return pessoaRepository.findAll();
    }

    @PostMapping
    public PessoaModel criarPessoa(PessoaModel pessoaModel) {
        return pessoaRepository.save(pessoaModel);
    }
}
