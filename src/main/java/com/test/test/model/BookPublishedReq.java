package com.test.test.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.test.test.Entity.BrandType;

import lombok.Getter;

@Getter
public class BookPublishedReq {
 
    private String author;
    
    private String title;

    private String content;
    
    @JsonIgnore
    private final BrandType brand = BrandType.kubo;

}