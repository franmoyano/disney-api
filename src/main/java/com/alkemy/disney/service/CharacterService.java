package com.alkemy.disney.service;

import com.alkemy.disney.dto.CharacterDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CharacterService {

    CharacterDTO save(CharacterDTO dto);

    List<CharacterDTO> findAll();

    void deleteById(Long id);
}
