package com.dearliteraria.first_spring_app.repositories;

import com.dearliteraria.first_spring_app.entities.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Books, Long> {


}
