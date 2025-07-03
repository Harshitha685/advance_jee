package com.amazon.amazonapp.service;

import com.amazon.amazonapp.dto.UserDto;

public interface UserRegisterService {

    boolean validAndSaveUser(UserDto dto);
}
