package com.dearliteraria.first_spring_app.projections;

public interface PostsMinProjection {
    Long getId();
    String getTitile();
    Integer getYear();
    String getImgUrl();
    String getAuthor();
    Boolean getRating();
}
