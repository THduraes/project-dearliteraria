package com.dearliteraria.first_spring_app.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;


@Getter
@Setter
@Entity
@Table(name = "tb_posts")
public class DearPosts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String shortReview;
    private Integer user_id;

    @Column(columnDefinition = "TEXT")
    private String review;

    @Column(columnDefinition = "TEXT")
    private String obs;

    public DearPosts(){
    }

    public DearPosts(Long id, String shortReview, Integer user_id, String review, String obs) {
        this.id = id;
        this.shortReview = shortReview;
        this.user_id = user_id;
        this.review = review;
        this.obs = obs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DearPosts dearPosts = (DearPosts) o;
        return Objects.equals(id, dearPosts.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
