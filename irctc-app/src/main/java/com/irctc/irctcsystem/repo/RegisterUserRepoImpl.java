package com.irctc.irctcsystem.repo;

import com.irctc.irctcsystem.dto.UserDto;

public class RegisterUserRepoImpl implements RegisterUserRepo{
    @Override
    public boolean saveUser(UserDto dto) {
        System.out.println(dto);
        return false;
    }
}
