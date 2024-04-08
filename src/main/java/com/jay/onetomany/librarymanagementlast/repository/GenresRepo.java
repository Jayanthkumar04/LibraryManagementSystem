package com.jay.onetomany.librarymanagementlast.repository;

import com.jay.onetomany.librarymanagementlast.entity.Genres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface GenresRepo extends JpaRepository<Genres,Long> {

    @Query(value = "select s.genre_name from Genres s where s.genre_id in:id",nativeQuery = true)
    Set<String>findByIdd(Set<Long> id);


}
