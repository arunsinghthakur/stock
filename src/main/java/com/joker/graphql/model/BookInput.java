package com.joker.graphql.model;

import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class BookInput {
    private String isbn;
    private String name;
    private String author;

    public Book toBook() {
        return Book.builder()
                .uuid(UUID.randomUUID().toString())
                .isbn(this.isbn)
                .author(this.author)
                .name(this.name)
                .build();
    }
}