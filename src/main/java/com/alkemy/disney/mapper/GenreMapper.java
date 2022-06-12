package com.alkemy.disney.mapper;

import com.alkemy.disney.dto.GenreDTO;
import com.alkemy.disney.entity.GenreEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GenreMapper {

    public GenreEntity DTO2Entity(GenreDTO dto) {
        GenreEntity genreEntity = new GenreEntity();
        genreEntity.setId(dto.getId());
        genreEntity.setImage(dto.getImage());
        genreEntity.setName(dto.getName());
        genreEntity.setMovies(dto.getMovies());
        return genreEntity;
    }

    public GenreDTO entity2DTO(GenreEntity entity) {
        GenreDTO generoDTO = new GenreDTO();
        generoDTO.setId(entity.getId());
        generoDTO.setImage(entity.getImage());
        generoDTO.setName(entity.getName());
        generoDTO.setMovies(entity.getMovies());
        return generoDTO;
    }

    public List<GenreDTO> entityList2DTOList(List<GenreEntity> entities) {
        List<GenreDTO> dtos = new ArrayList<>();
        for(GenreEntity entity : entities) {
            dtos.add(entity2DTO(entity));
        }
        return dtos;
    }

    public List<GenreEntity> DTOList2EntityList(List<GenreDTO> dtos) {
        List<GenreEntity> genreEntities = new ArrayList<>();
        for(GenreDTO dto : dtos) {
            genreEntities.add(DTO2Entity(dto));
        }
        return genreEntities;
    }
}
