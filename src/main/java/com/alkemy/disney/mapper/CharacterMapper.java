package com.alkemy.disney.mapper;

import com.alkemy.disney.dto.CharacterDTO;
import com.alkemy.disney.entity.CharacterEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CharacterMapper {

    public CharacterEntity DTO2Entity(CharacterDTO dto) {
        CharacterEntity entity = new CharacterEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setAge(dto.getAge());
        entity.setImage(dto.getImage());
        entity.setMovies(dto.getMovies());
        entity.setHistory(dto.getHistory());
        entity.setWeight(dto.getWeight());
        return entity;
    }

    public CharacterDTO entity2DTO(CharacterEntity entity) {
        CharacterDTO dto = new CharacterDTO();
        dto.setAge(entity.getAge());
        dto.setHistory(entity.getHistory());
        dto.setImage(entity.getImage());
        dto.setMovies(entity.getMovies());
        dto.setWeight(entity.getWeight());
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    public List<CharacterEntity> DTOList2EntityList(List<CharacterDTO> dtos) {
        List<CharacterEntity> entities = new ArrayList<>();
        for(CharacterDTO dto : dtos) {
            entities.add(DTO2Entity(dto));
        }
        return entities;
    }

    public List<CharacterDTO> entityList2DTOList(List<CharacterEntity> entities) {
        List<CharacterDTO> dtos = new ArrayList<>();
        for(CharacterEntity entity : entities) {
            dtos.add(entity2DTO(entity));
        }
        return dtos;
    }
}
