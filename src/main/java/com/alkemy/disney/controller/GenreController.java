package com.alkemy.disney.controller;

import com.alkemy.disney.dto.GenreDTO;
import com.alkemy.disney.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("generos")
public class GenreController {

    @Autowired
    private GenreService generoService;

    @GetMapping
    public ResponseEntity<List<GenreDTO>> findAll() {
        List<GenreDTO> generos = generoService.findAll();
        return ResponseEntity.ok().body(generos);
    }

    @PostMapping
    public ResponseEntity<GenreDTO> save(@RequestBody GenreDTO genero) {
        GenreDTO generoGuardado = generoService.save(genero);
        return ResponseEntity.status(HttpStatus.CREATED).body(generoGuardado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        generoService.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
