package com.product.productapp.repo;

import com.product.productapp.dto.UserDto;

public class UserRepoImpl implements UserRepo{
    @Override
    public boolean saveUser(UserDto dto) {
        System.out.println(dto);
        return false;
    }
}
