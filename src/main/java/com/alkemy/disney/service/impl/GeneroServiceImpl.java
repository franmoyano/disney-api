package com.alkemy.disney.service.impl;

import com.alkemy.disney.dto.GeneroDTO;
import com.alkemy.disney.entity.GeneroEntity;
import com.alkemy.disney.mapper.GeneroMapper;
import com.alkemy.disney.repository.GeneroRepository;
import com.alkemy.disney.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroServiceImpl implements GeneroService {

    @Autowired
    private GeneroMapper generoMapper;
    @Autowired
    private GeneroRepository generoRepository;

    public GeneroDTO save(GeneroDTO dto) {
        GeneroEntity entity = generoMapper.generoDTO2Entity(dto);
        GeneroEntity entitySaved = generoRepository.save(entity);
        GeneroDTO result = generoMapper.generoEntity2DTO(entitySaved);
        return result;
    }

    public List<GeneroDTO> findAll() {
        List<GeneroEntity> entities = generoRepository.findAll();
        List<GeneroDTO> result = generoMapper.generoEntityList2DTOList(entities);
        return result;
    }

    public void deleteById(Long id) {
        generoRepository.deleteById(id);
    }


}
