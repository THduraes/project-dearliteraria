package com.dearliteraria.first_spring_app.dto;


import com.dearliteraria.first_spring_app.entities.Books;
import lombok.Getter;

@Getter
public class BooksMinDto {
    private Long id;
    private String title;
    private String author;
    private String genre;
    private String imgUrl;

    public BooksMinDto(){

    }

    public BooksMinDto(Books entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.genre = entity.getGenre();
        this.imgUrl = entity.getImgUrl();
    }
}
