package com.test.test.service;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.test.test.Entity.BookEntity;
import com.test.test.model.BookPublishedReq;
import com.test.test.model.BookReq;
import com.test.test.repository.BookRepository;

import lombok.RequiredArgsConstructor;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Cacheable("getBooks")
    public List<BookEntity> getBooks(BookReq bookReq) {
        List<BookEntity> bookEntities = bookRepository
        .getBookList(bookReq.getAuthor(), bookReq.getBrand(), bookReq.getTitle())
            .orElse(null);

        bookEntities.remove(0);

        return bookEntities;    
    }

    public List<BookEntity> findAll() {
        return bookRepository.findAll();
    }

    public BookEntity publishedBook(BookPublishedReq publishedReq) {
        BookEntity bookEntity = BookEntity.builder()
            .author(publishedReq.getAuthor())
            .title(publishedReq.getTitle())
            .content(publishedReq.getContent())
            .build();

        return bookRepository.save(bookEntity);
    }
    
}
