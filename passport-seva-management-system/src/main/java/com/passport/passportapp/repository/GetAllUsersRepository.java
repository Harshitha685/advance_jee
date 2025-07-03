package com.passport.passportapp.repository;

import com.passport.passportapp.dto.UserDto;

public interface GetAllUsersRepository {


    UserDto[] fetchAllUsers();
}
