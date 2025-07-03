package com.xworkz.zeptoapp.signup;
import com.xworkz.zeptoapp.userdata.ZeptoUserDto;
public class Zepto
{
    ZeptoUserDto user;
    public boolean userSignUp(ZeptoUserDto user) {
        if(userValidation(user)) {
            this.user = user;
            return true;
        } else {
            return false;
        }
    }

    public boolean userValidation(ZeptoUserDto user) {
        boolean isUserValid = false;
        boolean isEmailValid = false;
        boolean isPhoneValid = false;
        boolean isNameValid = false;
        boolean isPasswordValid = false;
        boolean isAddressValid = false;

        if (user.getEmail() != null && user.getEmail().contains("@")) {
            isEmailValid = true;
        } else {
            System.out.println("Invalid Email. Please provide a valid email ID.");
        }

        if (user.getPhoneNumber() != null && user.getPhoneNumber().length() == 10) {
            isPhoneValid = true;
        } else {
            System.out.println("Invalid Phone Number. Please provide a 10-digit number.");
        }

        if (user.getName() != null && user.getName().length() > 0 && user.getName().length() <= 45) {
            isNameValid = true;
        } else {
            System.out.println("Invalid Name. Please provide a valid name.");
        }

        if (user.getPassword() != null && user.getPassword().length() >= 8 && user.getPassword().length() <= 16) {
            isPasswordValid = true;
        } else {
            System.out.println("Invalid Password. Must be 8-16 characters long.");
        }

        if (user.getAddress() != null && !user.getAddress().isEmpty()) {
            isAddressValid = true;
        } else {
            System.out.println("Invalid Address. Please provide a delivery address.");
        }

        if (isEmailValid && isPhoneValid && isNameValid && isPasswordValid && isAddressValid) {
            isUserValid = true;
        }

        return isUserValid;
    }

    public void getUserDetails(){
        System.out.println("Email id of the user : "+this.user.getEmail());
        System.out.println("Phone number : "+this.user.getPassword());
        System.out.println("Password is : "+this.user.getPassword());
        System.out.println("Name of the user is : "+this.user.getName());
        System.out.println("Address : "+this.user.getAddress());
    }
}
