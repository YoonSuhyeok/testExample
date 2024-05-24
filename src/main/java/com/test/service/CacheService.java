package com.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.model.Title;
import com.test.repository.CacheRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CacheService {

    private final CacheRepository cacheRepository;

    public List<Title> getTitles() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTitles'");
    }
    
}
