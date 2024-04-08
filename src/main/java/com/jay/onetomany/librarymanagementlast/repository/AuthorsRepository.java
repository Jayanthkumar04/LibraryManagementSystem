package com.jay.onetomany.librarymanagementlast.repository;

import com.jay.onetomany.librarymanagementlast.entity.Authors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorsRepository extends JpaRepository<Authors,Long> {



}
