package com.jay.onetomany.librarymanagementlast.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="genres")
public class Genres {

    @Id
    @Column(name="genre_id")
    private long genreId;

    @Column(name="genre_name")
    private String genreName;

    @OneToMany(targetEntity = Books.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER,orphanRemoval = true)
    @JoinColumn(referencedColumnName = "genre_id",name="genre_id")
    List<Books> books;

}
