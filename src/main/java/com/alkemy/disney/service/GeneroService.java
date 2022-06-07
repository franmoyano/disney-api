package com.alkemy.disney.service;

import com.alkemy.disney.dto.GeneroDTO;
import org.springframework.stereotype.Service;

@Service
public class GeneroService {

    public GeneroDTO save(GeneroDTO dto) {
        // TODO: guardar genero
        System.out.println("GUARDAR GENERO");
        return dto;
    }
}
