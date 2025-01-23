package com.dearliteraria.first_spring_app.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "tb_belonging")
public class BelongingPostsBooks {
    @EmbeddedId

    private BelonginPsBksPK id = new BelonginPsBksPK();
    private double rating;

    public BelongingPostsBooks(){

    }

    public BelongingPostsBooks(Books books, DearPosts posts, double rating) {
        this.id.setBooks(books);
        this.id.setDearPosts(posts);
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPostsBooks that = (BelongingPostsBooks) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
