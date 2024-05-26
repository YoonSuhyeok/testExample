package com.test.test.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookReq extends BaseReq implements java.io.Serializable {
    
    @NotBlank
    private String title;

}
