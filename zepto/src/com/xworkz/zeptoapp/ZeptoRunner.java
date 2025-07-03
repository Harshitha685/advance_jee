package com.xworkz.zeptoapp;
import com.xworkz.zeptoapp.userdata.ZeptoUserDto;
import com.xworkz.zeptoapp.signup.Zepto;
public class ZeptoRunner
{
    public static void main(String[] args) {
        ZeptoUserDto user1 = new ZeptoUserDto();
        user1.setEmail("user12@zepto.com");
        user1.setPhoneNumber("9876543210");
        user1.setName("Sumathi");
        user1.setPassword("Groceries@897");
        user1.setAddress("12th Cross, JP Nagar, Bangalore");

        Zepto zepto = new Zepto();
        if (zepto.userSignUp(user1)) {
            System.out.println("Zepto User Registration Successful");
        } else {
            System.out.println("Zepto User Registration Failed");
        }
        zepto.getUserDetails();
    }
}
