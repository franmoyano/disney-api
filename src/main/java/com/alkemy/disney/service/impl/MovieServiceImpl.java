package com.alkemy.disney.service.impl;

import com.alkemy.disney.dto.MovieDTO;
import com.alkemy.disney.entity.MovieEntity;
import com.alkemy.disney.mapper.MovieMapper;
import com.alkemy.disney.repository.MovieRepository;
import com.alkemy.disney.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieMapper movieMapper;
    @Autowired
    private MovieRepository movieRepository;

    public MovieDTO save(MovieDTO movieDTO) {
        MovieEntity entity = movieMapper.DTO2Entity(movieDTO);
        MovieEntity savedEntity = movieRepository.save(entity);
        return movieMapper.entity2DTO(savedEntity);
    }

    public List<MovieDTO> findAll() {
        List<MovieEntity> entities = movieRepository.findAll();
        return movieMapper.entityList2DTOList(entities);
    }

    public void deleteById(Long id) {
        movieRepository.deleteById(id);
    }
}
