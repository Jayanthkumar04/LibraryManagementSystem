package com.jay.onetomany.librarymanagementlast.repository;

import com.jay.onetomany.librarymanagementlast.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface BooksRepo extends JpaRepository<Books,Long> {

    @Query(value="select * from Books b where b.book_id=:id",nativeQuery = true)
    Books findByBookId(long id);

    @Query(value="select b.genre_id from Books b",nativeQuery = true)
    Set<Long> findByBook();

    @Query(value="select b.book_id from Books b where b.title=:name",nativeQuery = true)
    long findByBookName(String name);

}
