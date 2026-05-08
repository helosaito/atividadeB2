package com.spring.security.services;

import com.spring.security.models.PobreModel;
import com.spring.security.repositories.PobreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PobreService {

    @Autowired
    PobreRepository pobreRepository;

    public List<PobreModel> findall() {
        return pobreRepository.findAll();
    }

    public PobreModel criarPessoa(PobreModel pobreModel) {
        return pobreRepository.save(pobreModel);
    }


}