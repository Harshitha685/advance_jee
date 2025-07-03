package com.amazon.amazonapp.repo;

import com.amazon.amazonapp.dto.UserDto;

public interface UserRegisterRepo {

    boolean saveUser(UserDto dto);
}
