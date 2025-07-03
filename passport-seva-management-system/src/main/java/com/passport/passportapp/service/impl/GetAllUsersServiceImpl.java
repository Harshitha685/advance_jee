package com.passport.passportapp.service.impl;

import com.passport.passportapp.dto.UserDto;
import com.passport.passportapp.repository.GetAllUsersRepository;
import com.passport.passportapp.repository.impl.GetAllUsersRepositoryImpl;
import com.passport.passportapp.service.GetAllUsersService;

public class GetAllUsersServiceImpl implements GetAllUsersService {

    GetAllUsersRepository repository;

    public GetAllUsersServiceImpl(){
        repository = new GetAllUsersRepositoryImpl();
    }
    @Override
    public UserDto[] getAllUsers() {
        return repository.fetchAllUsers();
    }
}
