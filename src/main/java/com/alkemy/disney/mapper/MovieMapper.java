package com.alkemy.disney.mapper;

import com.alkemy.disney.dto.MovieDTO;
import com.alkemy.disney.entity.MovieEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MovieMapper {

    public MovieEntity DTO2Entity(MovieDTO dto) {
        MovieEntity movieEntity = new MovieEntity();
        movieEntity.setId(dto.getId());
        movieEntity.setImage(dto.getImage());
        movieEntity.setTitle(dto.getTitle());
        movieEntity.setCreationDate(dto.getCreationDate());
        movieEntity.setCharacters(dto.getCharacters());
        movieEntity.setGenre(dto.getGenre());
        return movieEntity;
    }

    public MovieDTO entity2DTO(MovieEntity entity) {
        MovieDTO movieDTO = new MovieDTO();
        movieDTO.setId(entity.getId());
        movieDTO.setTitle(entity.getTitle());
        movieDTO.setImage(entity.getImage());
        movieDTO.setCharacters(entity.getCharacters());
        movieDTO.setGenre(entity.getGenre());
        movieDTO.setCreationDate(entity.getCreationDate());
        return movieDTO;
    }

    public List<MovieDTO> entityList2DTOList(List<MovieEntity> movieEntities) {
        List<MovieDTO> movieDTOS = new ArrayList<>();
        for(MovieEntity entity : movieEntities) {
            movieDTOS.add(entity2DTO(entity));
        }
        return movieDTOS;
    }

    public List<MovieEntity> DTOList2EntityList(List<MovieDTO> movieDTOS) {
        List<MovieEntity> movieEntities = new ArrayList<>();
        for(MovieDTO dto : movieDTOS) {
            movieEntities.add(DTO2Entity(dto));
        }
        return movieEntities;
    }
}
