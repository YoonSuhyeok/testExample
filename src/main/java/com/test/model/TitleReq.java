package com.test.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class TitleReq extends BaseReq {
    
    @NotBlank
    private String title;

}
