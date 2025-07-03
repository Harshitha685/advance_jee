package com.netflix.netflixapp.service;

import com.netflix.netflixapp.dto.UserDto;

public interface UserRegisterService {

    boolean validAndSaveUser(UserDto dto);
}
