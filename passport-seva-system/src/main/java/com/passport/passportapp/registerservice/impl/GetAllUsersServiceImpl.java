package com.passport.passportapp.registerservice.impl;

import com.passport.passportapp.dto.UserDto;
import com.passport.passportapp.registerservice.GetAllUsersService;
import com.passport.passportapp.repository.GetAllUsersRepository;
import com.passport.passportapp.repository.impl.GetAllUsersRepositoryImpl;

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
