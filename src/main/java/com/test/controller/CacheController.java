package com.test.controller;

import org.springframework.web.bind.annotation.RestController;

import com.test.model.Title;
import com.test.model.TitleReq;
import com.test.service.CacheService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequiredArgsConstructor
public class CacheController {
    
    private final CacheService cacheService;

    @GetMapping("/api/v1/titles")
    public ResponseEntity<List<Title>> getMethodName(@Valid @RequestParam TitleReq titleReq) {
        List<Title> titles = cacheService.getTitles();
        return ResponseEntity.ok(titles);
    }
    

}
