package com.dearliteraria.first_spring_app.controllers;


import com.dearliteraria.first_spring_app.dto.PostsDTO;
import com.dearliteraria.first_spring_app.entities.DearPosts;
import com.dearliteraria.first_spring_app.services.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/posts")
public class PostsController {
    @Autowired

    private PostsService postsService;

    @GetMapping
    public List<PostsDTO> findAll(){
        List<PostsDTO> result = postsService.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public PostsDTO findById(@PathVariable Long id){
        PostsDTO result = postsService.findById(id);
        return result;
    }
}