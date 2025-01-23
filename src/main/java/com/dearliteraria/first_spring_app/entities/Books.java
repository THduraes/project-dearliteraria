package com.dearliteraria.first_spring_app.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

    @Getter
    @Setter
    @Entity
    @Table(name = "tb_book")
    public class Books {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String title;
        private String author;
        private String genre;
        private String imgUrl;
        @Column(name = "book_year")
        private Integer year;

        public Books(Long id, String title, String author, String genre, String imgUrl, Integer year, String descri) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.imgUrl = imgUrl;
            this.year = year;
        }

        public Books() {

        }

        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return Objects.equals(id, books.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
