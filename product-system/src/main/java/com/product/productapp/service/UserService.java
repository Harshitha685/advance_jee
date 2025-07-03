package com.product.productapp.service;

import com.product.productapp.dto.UserDto;

public interface UserService {
    boolean validAndSaveUser(UserDto dto);
}
