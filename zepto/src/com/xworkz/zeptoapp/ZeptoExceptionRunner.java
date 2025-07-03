package com.xworkz.zeptoapp;

import com.xworkz.zeptoapp.exception.*;
import com.xworkz.zeptoapp.userdata.ZeptoUserDto;

public class ZeptoExceptionRunner {

    public static void main(String[] args) {
        String email = getEmailByPhone("123456789");
        System.out.println("email is " + email);
        String phone = getPhoneNumberByPhone("123456789");
        System.out.println("Phone number is " +phone);
        try {
           String password =  getPasswordByPhone("9876543210");
            System.out.println("the password : " +password);
        }catch (PasswordNotFoundException pnf){
            pnf.printStackTrace();
        }
        try {
            String name = getNameByPhone("9876543210");
            System.out.println("Name is : " +name);
        }catch (NameNotFoundException nnf){
            nnf.printStackTrace();
        }

        try {
           String address = getAddressByPhone("9876543210");
            System.out.println("Address is : " +address);
        }catch (AddressNotFoundException anf){
            anf.printStackTrace();
        }
    }

    public static String getEmailByPhone(String phone) {
        String email = null;
        try {
            ZeptoUserDto dto = new ZeptoUserDto();
            dto.setEmail("har12@gmail.com");
            dto.setPhoneNumber("123456789");

            if (dto.getPhoneNumber().equals(phone))
                email = dto.getEmail();
            else {
                EmailNotFoundException emailNotFoundException = new EmailNotFoundException("User email not found with phone number " + phone);
                throw emailNotFoundException;
            }
        } catch (EmailNotFoundException enf) {
            enf.printStackTrace();
        }
        return email;
    }

    public static String getPhoneNumberByPhone(String phone) {
        String phoneNo = null;
        try {

            ZeptoUserDto dto = new ZeptoUserDto();
            dto.setEmail("har12@gmail.com");
            dto.setPhoneNumber("123456789");

            if (dto.getPhoneNumber() == phone)
                phoneNo = dto.getPhoneNumber();
            else {
                PhoneNoNotFoundException phoneNoNotFoundException = new PhoneNoNotFoundException("No user phone number is found with phone " + phone);
                throw phoneNoNotFoundException;
            }
        } catch (PhoneNoNotFoundException pnf) {
            pnf.printStackTrace();
        }
        return phoneNo;

    }

    public static String getPasswordByPhone(String phone) throws PasswordNotFoundException {
        ZeptoUserDto dto = new ZeptoUserDto();
        dto.setPhoneNumber("9876543210");
        dto.setPassword("secretPass123");

        if (dto.getPhoneNumber().equals(phone)) {
            return dto.getPassword();
        } else {
            throw new PasswordNotFoundException("No user password found with phone number " + phone);
        }
    }

    public static String getNameByPhone(String phone) throws NameNotFoundException {
        ZeptoUserDto dto = new ZeptoUserDto();
        dto.setPhoneNumber("9876543210");
        dto.setName("John Doe");

        if (dto.getPhoneNumber().equals(phone)) {
            return dto.getName();
        } else {
            throw new NameNotFoundException("No user name found with phone number " + phone);
        }
    }

    public static String getAddressByPhone(String phone) throws AddressNotFoundException {
        ZeptoUserDto dto = new ZeptoUserDto();
        dto.setPhoneNumber("9876543210");
        dto.setAddress("221B Baker Street, London");

        if (dto.getPhoneNumber().equals(phone)) {
            return dto.getAddress();
        } else {
            throw new AddressNotFoundException("No address found with phone number " + phone);
        }
    }
}
