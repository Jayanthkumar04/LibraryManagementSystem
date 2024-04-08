package com.jay.onetomany.librarymanagementlast.repository;

import com.jay.onetomany.librarymanagementlast.entity.Publishers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublishersRepo extends JpaRepository<Publishers,Long> {



}
