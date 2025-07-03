package com.passport.passportapp.registerservice;

import com.passport.passportapp.dto.UserDto;

public interface UserRegisterService {

    boolean validAndSaveUser(UserDto dto);
}
