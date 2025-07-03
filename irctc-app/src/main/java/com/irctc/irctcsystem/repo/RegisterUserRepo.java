package com.irctc.irctcsystem.repo;

import com.irctc.irctcsystem.dto.UserDto;

public interface RegisterUserRepo {

    boolean saveUser(UserDto dto);
}
