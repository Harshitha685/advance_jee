package com.xworkz.user.service.impl;

import com.xworkz.user.repo.GetUsersRepository;
import com.xworkz.user.repo.impl.GetUsersRepositoryImpl;
import com.xworkz.user.service.GetUsersService;
import com.xworkz.user.userregister.dto.UserDto;

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
