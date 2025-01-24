package com.dearliteraria.first_spring_app.repositories;

import com.dearliteraria.first_spring_app.entities.DearPosts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<DearPosts, Long> {

}
