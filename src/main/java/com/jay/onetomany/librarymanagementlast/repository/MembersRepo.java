package com.jay.onetomany.librarymanagementlast.repository;

import com.jay.onetomany.librarymanagementlast.entity.Members;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembersRepo extends JpaRepository<Members,Long> {


}
