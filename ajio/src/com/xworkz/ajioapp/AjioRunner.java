package com.xworkz.ajioapp;
import com.xworkz.ajioapp.userdata.AjioUserDto;
import com.xworkz.ajioapp.signup.Ajio;
public class AjioRunner
{

        public static void main(String[] args) {
            AjioUserDto user = new AjioUserDto();
            user.setEmail("anjali@ajio.com");
            user.setMobileNumber("9876543210");
            user.setPassword("Ajio@2025");
            user.setFullName("Anjali");

            Ajio ajio = new Ajio();
            //ajio.getUserDetails();
            if (ajio.userSignUp(user)) {
                System.out.println("Ajio Registration Successful!");
            } else {
                System.out.println("Ajio Registration Failed!");
            }
            System.out.println(user.toString());
        }
}


