package com.xworkz.user.repo;

import com.xworkz.user.userregister.dto.UserDto;

public interface RegisterRepo {
    boolean saveUser(UserDto dto);
}
