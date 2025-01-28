package com.dearliteraria.first_spring_app.dto;

import com.dearliteraria.first_spring_app.entities.DearUsers;
import lombok.Getter;

@Getter
public class DearUsersDto {
    private Long id;
    private String username;
    private String passwordHash;
    private String nickname;
    private String description;

    public DearUsersDto(){

    }

    public DearUsersDto(DearUsers entity) {
        this.id = entity.getId();
        this.username = entity.getUsername();
        this.passwordHash = entity.getPasswordHash();
        this.nickname = entity.getNickname();
        this.description = entity.getDescription();
    }
}
