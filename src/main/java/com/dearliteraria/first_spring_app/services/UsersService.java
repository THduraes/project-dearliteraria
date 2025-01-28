package com.dearliteraria.first_spring_app.services;

import com.dearliteraria.first_spring_app.dto.DearUsersDto;
import com.dearliteraria.first_spring_app.entities.DearUsers;
import com.dearliteraria.first_spring_app.repositories.DearUserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsersService {
    @Autowired
    private DearUserDTO dearUserDto;


    @Transactional(readOnly = true)
    public DearUsersDto findById(Long id){
        DearUsers result = dearUserDto.findById(id).get();
        DearUsersDto dto = new DearUsersDto(result);
        return dto;
    }

    @Transactional(readOnly = true)
    public List<DearUsersDto> findAll(){
        List<DearUsers> result = dearUserDto.findAll();
        return result.stream().map(x-> new DearUsersDto(x)).toList();
    }

    @Transactional(readOnly = true)
    public DearUsersDto findByUser(String nickname){
        DearUsers result = dearUserDto.findByNickname(nickname).get();
        DearUsersDto minDto = new DearUsersDto(result);
        return minDto;
    }
    
}
