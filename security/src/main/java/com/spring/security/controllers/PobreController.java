package com.spring.security.controllers;


import com.spring.security.models.PobreModel;
import com.spring.security.repositories.PobreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/pobres")
public class PobreController {

    @Autowired
    private PobreRepository pobreRepository;

    @GetMapping
    public List<PobreModel> findall() {
        return pobreRepository.findAll();
    }

    @PostMapping
    public PobreModel criarPessoa(PobreModel pobreModel) {
        return pobreRepository.save(pobreModel);
    }
}
