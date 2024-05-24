package com.test.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import com.test.model.Title;
import com.test.model.TitleReq;

@Repository
public class CacheRepository {
    
    private final Map<Long, Object> map = new HashMap<>();

    public CacheRepository() {
        map.put(1, new Title());
    }

    @Cacheable("getTitles")
    public List<Title> getTitles(TitleReq titleReq) {
        return null;
    }
    
}
