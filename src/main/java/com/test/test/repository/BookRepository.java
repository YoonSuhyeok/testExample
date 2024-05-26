package com.test.test.repository;

import java.util.List;
import java.util.Optional;

import com.test.test.Entity.BookEntity;
import com.test.test.Entity.BrandType;
import com.test.test.model.BookReq;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {

    @Query("SELECT b FROM Book b WHERE b.author = :author and b.brand = :brand and b.title = :title")
    Optional<List<BookEntity>> getBookList(@Param("author") String author, @Param("brand") BrandType brand, @Param("title") String title);

}
