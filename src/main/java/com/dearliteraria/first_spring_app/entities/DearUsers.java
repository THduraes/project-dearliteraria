package com.dearliteraria.first_spring_app.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.mindrot.jbcrypt.BCrypt;

import java.util.Objects;

@Getter
@Setter
@Entity
@Table (name = "tb_users")
public class DearUsers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String passwordHash;
    private String nickname;
    private String description;

    public DearUsers(){

    }
    public DearUsers(Long id, String username, String password, String nickname) {
        this.id = id;
        this.username = username;
        this.passwordHash = hashPassword(password);
        this.nickname = nickname;
    }
    public DearUsers(Long id, String username, String password, String nickname, String description) {
        this.id = id;
        this.username = username;
        this.passwordHash = hashPassword(password);
        this.nickname = nickname;
        this.description = description;
    }

    private String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public boolean checkPassword(String candidatePassword) {
        return BCrypt.checkpw(candidatePassword, this.passwordHash);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DearUsers dearUsers = (DearUsers) o;
        return id == dearUsers.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", nickname='" + nickname + '\'' +
                ", descripition='"+ description + '\''+
                '}';
    }
}
