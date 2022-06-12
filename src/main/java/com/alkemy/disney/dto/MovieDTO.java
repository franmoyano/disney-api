package com.alkemy.disney.dto;

import com.alkemy.disney.entity.CharacterEntity;
import com.alkemy.disney.entity.GenreEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class MovieDTO {
    private Long id;
    private String image;
    private String title;
    private LocalDate creationDate;
    private List<CharacterEntity> characters;
    private GenreEntity genre;
}
