package com.passport.passportapp.repository;

import com.passport.passportapp.dto.UserDto;

public interface RegisterUserRepo {

    boolean saveUser(UserDto dto);
}
