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
@Table(name = "authors")
public class Authors {


    @Column(name="author_id")
    @Id
private long authorId;
    @Column(name="author_name")
private String authorName;

@OneToMany(targetEntity = BookAuthors.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER,orphanRemoval = true)
@JoinColumn(referencedColumnName = "author_id",name="author_id")
private List<BookAuthors>bookAuthors;



}
