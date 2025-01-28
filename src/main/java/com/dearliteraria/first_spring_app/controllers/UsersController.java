package com.dearliteraria.first_spring_app.controllers;

import com.dearliteraria.first_spring_app.dto.DearUsersDto;
import com.dearliteraria.first_spring_app.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @GetMapping
    public List<DearUsersDto> findAll(){
        List<DearUsersDto> result = usersService.findAll();
        return result;
    }
    @GetMapping(value = "/{nickname}")
    public DearUsersDto findById(@PathVariable  String nickname){
        DearUsersDto result = usersService.findByUser(nickname);
        return result;
    }
}
