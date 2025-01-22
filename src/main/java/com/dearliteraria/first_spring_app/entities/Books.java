package com.dearliteraria.first_spring_app.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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
        private String descripition;
}
