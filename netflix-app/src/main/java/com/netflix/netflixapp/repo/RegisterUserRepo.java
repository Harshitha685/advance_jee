package com.netflix.netflixapp.repo;

import com.netflix.netflixapp.dto.UserDto;

public interface RegisterUserRepo {

    boolean saveUser(UserDto dto);
}
