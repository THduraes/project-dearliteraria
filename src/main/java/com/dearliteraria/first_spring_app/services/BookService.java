package com.dearliteraria.first_spring_app.services;


import com.dearliteraria.first_spring_app.dto.BooksMinDto;
import com.dearliteraria.first_spring_app.entities.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dearliteraria.first_spring_app.repositories.BookRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Transactional(readOnly = true)
    public List<BooksMinDto> findAll(){
       List<Books> result = bookRepository.findAll();
       return result.stream().map(x -> new BooksMinDto(x)).toList();
    }
}
