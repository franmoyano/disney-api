package com.alkemy.disney.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "generos")
@Getter
@Setter
@SQLDelete(sql = "UPDATE generos SET deleted = true WHERE id = ?")
@Where(clause = "deleted = false")
public class GeneroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String imagen;
    private Boolean deleted = Boolean.FALSE;
    @OneToMany
    @JoinTable(
            name = "pelicula_genero",
            joinColumns = @JoinColumn(name = "genero_id"),
            inverseJoinColumns = @JoinColumn(name = "pelicula_id")
    )
    private List<PeliculaEntity> peliculas;
}
