package com.xworkz.ajioapp;

import com.xworkz.ajioapp.exception.EmailNotFoundException;
import com.xworkz.ajioapp.exception.FullNameNotFoundException;
import com.xworkz.ajioapp.exception.MobileNoNotFoundException;
import com.xworkz.ajioapp.exception.PasswordNotFoundException;
import com.xworkz.ajioapp.userdata.AjioUserDto;
import sun.security.util.Password;

public class AjioExceptionRunner {

    public static void main(String[] args) {
        try {
            String email = getEmailById(1);
            System.out.println("User email is " + email);
        } catch (EmailNotFoundException e) {
            e.printStackTrace();
        }
        String mobile = getMobileNumberById(2);
        System.out.println("User mobile number is " +mobile);

        String password = getPasswordById(2);
        System.out.println("User password is " +password);

        String fullName = getfullNameById(1);
        System.out.println("User fullName is " +fullName);
    }

    public static String getEmailById(int id) throws EmailNotFoundException {
        AjioUserDto dto = new AjioUserDto();
        dto.setId(1);
        dto.setEmail("baba12@gmail.com");

        if (dto.getId() == id) {
            return dto.getEmail();
        } else {
            throw new EmailNotFoundException("No user email found with id " + id);
        }
    }

    public static String getMobileNumberById(int id){
        String mobileNo = null;
        try {

            AjioUserDto dto = new AjioUserDto();
            dto.setId(2);
            dto.setMobileNumber("123456789");

            if (dto.getId() == id)
               mobileNo = dto.getMobileNumber();
            else {
                MobileNoNotFoundException mobileNoNotFoundException = new MobileNoNotFoundException("No user mobile number is found with id "  + id);
                throw mobileNoNotFoundException;
            }
        }catch ( MobileNoNotFoundException mnf){
            mnf.printStackTrace();
        }
        return mobileNo;


    }

    public static String getPasswordById(int id){

        String password = null;
        try {

            AjioUserDto dto = new AjioUserDto();
            dto.setId(2);
            dto.setPassword("baba12");

            if (dto.getId() == id)
                password = dto.getPassword();
            else {
                PasswordNotFoundException passwordNotFoundException = new  PasswordNotFoundException("No user password is found with id "  + id);
                throw passwordNotFoundException;
            }
        }catch ( PasswordNotFoundException pnf){
            pnf.printStackTrace();
        }
        return password;

    }

    public static String getfullNameById(int id){
        String fullName = null;
        try {

            AjioUserDto dto = new AjioUserDto();
            dto.setId(2);
            dto.setFullName("Baba Singh");

            if (dto.getId() == id)
                fullName = dto.getFullName();
            else {
                FullNameNotFoundException fullNameNotFoundException = new  FullNameNotFoundException ("No user fullName is  found with id "  + id);
                throw fullNameNotFoundException;
            }
        }catch ( FullNameNotFoundException fnf){
            fnf.printStackTrace();
        }
        return fullName;

    }

    }
