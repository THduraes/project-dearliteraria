package com.dearliteraria.first_spring_app.dto;

import com.dearliteraria.first_spring_app.entities.DearUsers;
import lombok.Getter;


@Getter
public class DearUsersMinDto {
    private Long id;
    private String nickname;
    private String description;


    public DearUsersMinDto(){

    }

    public DearUsersMinDto(DearUsers entity) {
        this.id = entity.getId();
        this.nickname = entity.getNickname();
        this.description = entity.getDescription();
    }
}
