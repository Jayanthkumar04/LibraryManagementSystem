package com.jay.onetomany.librarymanagementlast.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="publishers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Publishers {

    @Id
    @Column(name="publisher_id")
    private long publisherId;
    @Column(name="publisher_name")
    private String publisherName;

    @OneToMany(targetEntity = Books.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER,orphanRemoval = true)
    @JoinColumn(referencedColumnName ="publisher_id",name="publisher_id")
    List<Books> books;

}
