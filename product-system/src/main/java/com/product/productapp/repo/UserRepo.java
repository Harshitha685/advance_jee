package com.product.productapp.repo;

import com.product.productapp.dto.UserDto;

public interface UserRepo {
    boolean saveUser(UserDto dto);
}
