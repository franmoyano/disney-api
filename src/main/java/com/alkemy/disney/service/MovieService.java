package com.alkemy.disney.service;

import com.alkemy.disney.dto.MovieDTO;

import java.util.List;

public interface MovieService {

    MovieDTO save(MovieDTO movieDTO);

    List<MovieDTO> findAll();

    void deleteById(Long id);
}
