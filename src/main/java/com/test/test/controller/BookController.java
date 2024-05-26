package com.test.test.controller;

import org.springframework.web.bind.annotation.*;

import com.test.test.Entity.BookEntity;
import com.test.test.model.BookPublishedReq;
import com.test.test.model.BookReq;
import com.test.test.service.BookService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.ResponseEntity;


@RestController
public class BookController {
    
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/api/v1/published/book")
    public ResponseEntity<List<BookEntity>> getPublishedBook(@Valid @RequestBody BookReq bookReq) {
        List<BookEntity> titles = bookService.getBooks(bookReq);
        return ResponseEntity.ok(titles);
    }

    @GetMapping("/api/v1/findAll")
    public ResponseEntity<List<BookEntity>> getMethodName() {
        return ResponseEntity.ok(bookService.findAll());
    }

    @PostMapping("/api/v1/book")
    public ResponseEntity<BookEntity> postMethodName(@RequestBody BookPublishedReq publishedReq) {
        return ResponseEntity.ok(bookService.publishedBook(publishedReq));
    }
    
}
