package com.jay.onetomany.librarymanagementlast.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Year;
import java.util.Date;

@Entity
@Table(name="books")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books {

    @Column(name="book_id")

    private long bookId;
@Column(name="title")
private String title;
@Column(name="author")
private String author;

@Column(name="isbn")
@Id
private long isbn;

@Column(name="genre_id")
private long genreId;

@Column(name="publication_year")
private int publicationYear;

@Column(name="publisher_id")
private long publisherId;

@Column(name="quantity")
private int quantity;


}
