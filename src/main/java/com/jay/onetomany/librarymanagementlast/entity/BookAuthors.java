package com.jay.onetomany.librarymanagementlast.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="book_authors")
public class BookAuthors {

    @Id
    @Column(name="book_id")
    private long bookId;

@Column(name="author_id")
private long authorId;






}
