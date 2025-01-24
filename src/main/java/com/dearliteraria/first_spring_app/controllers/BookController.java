package com.dearliteraria.first_spring_app.controllers;

import com.dearliteraria.first_spring_app.dto.BooksMinDto;
import com.dearliteraria.first_spring_app.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/books")
public class BookController {
    @Autowired

    private BookService bookService;

    @GetMapping
    public List<BooksMinDto> findAll(){
        List<BooksMinDto> result = bookService.findAll();
        return result;
    }
}
