package com.alkemy.disney.mapper;

import com.alkemy.disney.dto.GeneroDTO;
import com.alkemy.disney.entity.GeneroEntity;
import org.springframework.stereotype.Component;

@Component
public class GeneroMapper {

    public GeneroEntity generoDTO2Entity(GeneroDTO dto) {
        GeneroEntity generoEntity = new GeneroEntity();
        generoEntity.setId(dto.getId());
        generoEntity.setImagen(dto.getImagen());
        generoEntity.setNombre(dto.getNombre());
        return generoEntity;
    }

    public GeneroDTO generoEntity2DTO(GeneroEntity entity) {
        GeneroDTO generoDTO = new GeneroDTO();
        generoDTO.setId(entity.getId());
        generoDTO.setImagen(entity.getImagen());
        generoDTO.setNombre(entity.getNombre());
        return generoDTO;
    }
}
