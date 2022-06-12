package com.alkemy.disney.service.impl;

import com.alkemy.disney.dto.GenreDTO;
import com.alkemy.disney.entity.GenreEntity;
import com.alkemy.disney.mapper.GenreMapper;
import com.alkemy.disney.repository.GenreRepository;
import com.alkemy.disney.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreServiceImpl implements GenreService {

    @Autowired
    private GenreMapper genreMapper;
    @Autowired
    private GenreRepository generoRepository;

    public GenreDTO save(GenreDTO dto) {
        GenreEntity entity = genreMapper.DTO2Entity(dto);
        GenreEntity savedEntity = generoRepository.save(entity);
        return genreMapper.entity2DTO(savedEntity);
    }

    public List<GenreDTO> findAll() {
        List<GenreEntity> entities = generoRepository.findAll();
        return genreMapper.entityList2DTOList(entities);
    }

    public void deleteById(Long id) {
        generoRepository.deleteById(id);
    }


}
