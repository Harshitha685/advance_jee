package com.irctc.irctcsystem.service;

import com.irctc.irctcsystem.dto.UserDto;

public interface RegisterUserService {

    boolean validAndSaveUser(UserDto dto);
}
