package com.xworkz.facebookapp;

import com.xworkz.facebookapp.exception.*;
import com.xworkz.facebookapp.userdata.FaceBookUserDto;

public class FaceBookExceptionRunner {

    public static void main(String[] args) {
        try {
            String email = getEmailByFullName("Baba");
            System.out.println("User email is " + email);
        } catch (EmailNotFoundException enf) {
            enf.printStackTrace();
        }

        try {
            String phone = getPhoneNumByFullName("Baba");
            System.out.println("User phone number is " + phone);
        } catch (PhoneNumNotFoundException pnnf) {
            pnnf.printStackTrace();
        }

        try {
           String dob =  getBobByFullName("Babu");
            System.out.println("User dob is " + dob);
        }catch (DobNotFoundException dnf){
            dnf.printStackTrace();
        }

        String password = getPasswordByFullName("Baba");
        System.out.println("the password is " +password);

       String fullName =  getfullNameByFullname("Baba Singh");
        System.out.println("the full name is " +fullName);
    }

    public static String getEmailByFullName(String name) throws EmailNotFoundException {
        FaceBookUserDto dto = new FaceBookUserDto();
        dto.setEmail("babu112@gmail.com");
        dto.setFullName("Baba");

        if (dto.getFullName().equals(name)) {
            return dto.getEmail();
        } else {
            throw new EmailNotFoundException("No user email found with fullName " + name);
        }
    }

    public static String getPhoneNumByFullName(String name) throws PhoneNumNotFoundException {
        FaceBookUserDto dto = new FaceBookUserDto();
        dto.setPhoneNumber("987654321");
        dto.setFullName("Baba");

        if (dto.getFullName().equals(name)) {
            return dto.getPhoneNumber();
        } else {
            throw new PhoneNumNotFoundException("No user phone Number found with fullName " + name);
        }
    }

    public static String getPasswordByFullName(String name) {

        String password = null;
        try {

            FaceBookUserDto dto = new FaceBookUserDto();
            dto.setFullName("Baba");
            dto.setPassword("baba12");

            if (dto.getFullName() == name)
                password = dto.getPassword();
            else {
                PasswordNotFoundException passwordNotFoundException = new PasswordNotFoundException("No user password is found with fullName " + name);
                throw passwordNotFoundException;
            }
        } catch (PasswordNotFoundException pnf) {
            pnf.printStackTrace();
        }
        return password;
    }

    public static String getfullNameByFullname(String name){
        String fullName = null;
        try {

            FaceBookUserDto dto = new FaceBookUserDto();
            dto.setEmail("bab12@gmail.com");
            dto.setFullName("Baba Singh");

            if (dto.getFullName().equals(name))
                fullName = dto.getFullName();
            else {
                FullNameNotFoundException fullNameNotFoundException = new  FullNameNotFoundException ("No user fullName is  found with fullName "  + name);
                throw fullNameNotFoundException;
            }
        }catch ( FullNameNotFoundException fnf){
            fnf.printStackTrace();
        }
        return fullName;

    }

    public static String getBobByFullName(String name) throws DobNotFoundException {
        FaceBookUserDto dto = new FaceBookUserDto();
        dto.setDateOfBirth("11-08-1990");
        dto.setFullName("Baba");

        if (dto.getFullName().equals(name)) {
            return dto.getDateOfBirth();
        } else {
            throw new DobNotFoundException("No user dob  found with fullName " + name);
        }
    }


}