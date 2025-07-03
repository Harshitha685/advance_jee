package com.amazon.amazonapp.repo;

import com.amazon.amazonapp.dto.UserDto;

public interface GetUsersRepository {
    UserDto[] fetchAllUsers();
}
