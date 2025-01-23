package com.dearliteraria.first_spring_app.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ManyToAny;

import java.util.Objects;

@Getter
@Setter
@Embeddable
public class BelonginPsBksPK {
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Books books;
    @ManyToOne
    @JoinColumn(name = "posts_id")
    private DearPosts dearPosts;

    public BelonginPsBksPK(){

    }

    public BelonginPsBksPK(Books books, DearPosts dearPosts) {
        this.books = books;
        this.dearPosts = dearPosts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BelonginPsBksPK that = (BelonginPsBksPK) o;
        return Objects.equals(books, that.books) && Objects.equals(dearPosts, that.dearPosts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(books, dearPosts);
    }
}
