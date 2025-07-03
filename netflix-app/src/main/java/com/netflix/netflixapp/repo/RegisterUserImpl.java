package com.netflix.netflixapp.repo;

import com.netflix.netflixapp.dto.UserDto;

public class RegisterUserImpl implements RegisterUserRepo{
    @Override
    public boolean saveUser(UserDto dto) {
        System.out.println(dto);
        //JDBC
        return false;
    }
}
