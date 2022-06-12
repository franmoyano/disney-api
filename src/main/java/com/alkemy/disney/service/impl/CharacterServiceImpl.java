package com.alkemy.disney.service.impl;

import com.alkemy.disney.dto.CharacterDTO;
import com.alkemy.disney.entity.CharacterEntity;
import com.alkemy.disney.mapper.CharacterMapper;
import com.alkemy.disney.repository.CharacterRepository;
import com.alkemy.disney.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterServiceImpl implements CharacterService {

    @Autowired
    private CharacterRepository characterRepository;
    @Autowired
    private CharacterMapper characterMapper;

    public CharacterDTO save(CharacterDTO dto) {
        CharacterEntity entity = characterMapper.DTO2Entity(dto);
        CharacterEntity savedEntity = characterRepository.save(entity);
        return characterMapper.entity2DTO(savedEntity);
    }

    public List<CharacterDTO> findAll() {
        List<CharacterEntity> entities = characterRepository.findAll();
        return characterMapper.entityList2DTOList(entities);
    }

    public void deleteById(Long id) {
        characterRepository.deleteById(id);
    }
}
