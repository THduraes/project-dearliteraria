package com.dearliteraria.first_spring_app.services;


import com.dearliteraria.first_spring_app.dto.BooksMinDto;
import com.dearliteraria.first_spring_app.dto.PostsDTO;
import com.dearliteraria.first_spring_app.entities.Books;
import com.dearliteraria.first_spring_app.entities.DearPosts;
import com.dearliteraria.first_spring_app.repositories.BookRepository;
import com.dearliteraria.first_spring_app.repositories.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PostsService {

    @Autowired
    private PostsRepository postsRepository;

    @Transactional(readOnly = true)
    public PostsDTO findById(Long id){
        DearPosts result = postsRepository.findById(id).get();
        PostsDTO dto = new PostsDTO(result);
        return dto;
    }

    @Transactional(readOnly = true)
    public List<PostsDTO> findAll(){
        List<DearPosts> result = postsRepository.findAll();
        return result.stream().map(x-> new PostsDTO(x)).toList();
    }
}
