package com.alkemy.disney.mapper;

import com.alkemy.disney.dto.GenreDTO;
import com.alkemy.disney.entity.GenreEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GenreMapper {

    public GenreEntity generoDTO2Entity(GenreDTO dto) {
        GenreEntity genreEntity = new GenreEntity();
        genreEntity.setId(dto.getId());
        genreEntity.setImagen(dto.getImagen());
        genreEntity.setNombre(dto.getNombre());
        return genreEntity;
    }

    public GenreDTO generoEntity2DTO(GenreEntity entity) {
        GenreDTO generoDTO = new GenreDTO();
        generoDTO.setId(entity.getId());
        generoDTO.setImagen(entity.getImagen());
        generoDTO.setNombre(entity.getNombre());
        return generoDTO;
    }

    public List<GenreDTO> generoEntityList2DTOList(List<GenreEntity> entities) {
        List<GenreDTO> dtos = new ArrayList<>();
        for(GenreEntity entity : entities) {
            dtos.add(generoEntity2DTO(entity));
        }
        return dtos;
    }
}
