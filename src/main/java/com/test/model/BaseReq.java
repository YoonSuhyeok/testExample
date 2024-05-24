package com.test.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class BaseReq {

    @NotBlank
    private String author;

    @NotBlank
    private String brand;

}
