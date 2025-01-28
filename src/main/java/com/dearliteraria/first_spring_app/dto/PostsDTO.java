package com.dearliteraria.first_spring_app.dto;

import com.dearliteraria.first_spring_app.entities.DearPosts;
import com.dearliteraria.first_spring_app.projections.PostsMinProjection;
import lombok.Getter;

@Getter
public class PostsDTO {
    private Long id;
    private Integer user_id;
    private String shortReview;
    private String review;
    private String obs;

    public PostsDTO(){

    }

    public PostsDTO(DearPosts entity) {
        this.id = entity.getId();
        this.shortReview = entity.getShortReview();
        this.user_id = entity.getUser_id();
        this.review = entity.getReview();
        this.obs = entity.getObs();
    }

   /* public PostsDTO(PostsMinProjection projection){
        this.id = projection.getId();
        this.shortReview = projection.();
        this.user_id = projection.getUser_id();
        this.review = entity.getReview();
        this.obs = entity.getObs();
    }*/
}
