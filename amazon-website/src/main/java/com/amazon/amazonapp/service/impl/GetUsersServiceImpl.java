package com.amazon.amazonapp.service.impl;

import com.amazon.amazonapp.dto.UserDto;
import com.amazon.amazonapp.repo.GetUsersRepository;
import com.amazon.amazonapp.repo.impl.GetUsersRepositoryImpl;
import com.amazon.amazonapp.service.GetUsersService;

public class GetUsersServiceImpl implements GetUsersService {

    GetUsersRepository repository;

    public GetUsersServiceImpl(){
        repository = new GetUsersRepositoryImpl();
    }

    @Override
    public UserDto[] getAllUsers() {
        return repository.fetchAllUsers();
    }
}
