package com.test.test.model;

import com.test.test.Entity.BrandType;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class BaseReq {

    private String author;

    private final BrandType brand = BrandType.kubo;

}
