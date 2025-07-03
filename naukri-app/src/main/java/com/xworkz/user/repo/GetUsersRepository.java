package com.xworkz.user.repo;

import com.xworkz.user.userregister.dto.UserDto;

public interface GetUsersRepository {
    UserDto[] fetchAllUsers();
}
