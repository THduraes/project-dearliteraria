package com.dearliteraria.first_spring_app.repositories;


import com.dearliteraria.first_spring_app.entities.DearUsers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DearUserDTO extends JpaRepository<DearUsers, Long> {

    Optional<DearUsers> findByNickname(String nickname);

}
