package com.product.productapp.service;

import com.product.productapp.dto.UserDto;
import com.product.productapp.repo.UserRepo;
import com.product.productapp.repo.UserRepoImpl;

public class UserServiceImpl implements UserService{
    UserRepo userRepo;

    public UserServiceImpl(){
        userRepo = new UserRepoImpl();
    }
    @Override
    public boolean validAndSaveUser(UserDto dto) {
        boolean isProductNameValid = false;
        boolean isCategoryValid = false;
        boolean isPriceValid = false;
        boolean isQuantityValid = false;
        boolean isDescriptionValid = false;
        boolean productValid = false;

        if (dto.getProductName() != null && !dto.getProductName().isEmpty()) {
            isProductNameValid = true;
        }

        if (dto.getCategory() != null && !dto.getCategory().isEmpty()) {
            isCategoryValid = true;
        }

        if (dto.getPrice() != null) {
            isPriceValid = true;
        }

        if (dto.getQuantity() != null) {
            isQuantityValid = true;
        }

        if (dto.getDescription() != null && !dto.getDescription().isEmpty()) {
            isDescriptionValid = true;
        }

        if (isProductNameValid && isCategoryValid && isPriceValid && isQuantityValid && isDescriptionValid) {
            productValid = userRepo.saveUser(dto);
        }

        return productValid;


    }
}
