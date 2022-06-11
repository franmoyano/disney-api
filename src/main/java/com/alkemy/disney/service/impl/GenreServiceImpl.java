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
        GenreEntity entity = genreMapper.generoDTO2Entity(dto);
        GenreEntity entitySaved = generoRepository.save(entity);
        GenreDTO result = genreMapper.generoEntity2DTO(entitySaved);
        return result;
    }

    public List<GenreDTO> findAll() {
        List<GenreEntity> entities = generoRepository.findAll();
        List<GenreDTO> result = genreMapper.generoEntityList2DTOList(entities);
        return result;
    }

    public void deleteById(Long id) {
        generoRepository.deleteById(id);
    }


}
