package com.test.test.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Book")
public class BookEntity implements java.io.Serializable {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
    @Column
    private String title;

    @Column
    private String content;

    @Column
    private String author;

    @Column
    @Enumerated(value = EnumType.STRING)
    private BrandType brand;

    @Builder
    public BookEntity(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.brand = BrandType.kubo;
    }
}
