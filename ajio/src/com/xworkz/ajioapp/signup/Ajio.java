package com.xworkz.ajioapp.signup;
import com.xworkz.ajioapp.userdata.AjioUserDto;
public class Ajio
{
AjioUserDto user;
        public boolean userSignUp(AjioUserDto user) {
            this.user = user;
            return userValidation(user);
        }

        public boolean userValidation(AjioUserDto user) {
            boolean isEmailValid = false;
            boolean isMobileValid = false;
            boolean isPasswordValid = false;
            boolean isFullNameValid = false;
            boolean isGenderValid = false;

            if (user.getEmail() != null && user.getEmail().contains("@")) {
                isEmailValid = true;
            } else {
                System.out.println("Invalid Email: '@' missing or null.");
            }

            if (user.getMobileNumber() != null && user.getMobileNumber().length() == 10) {
                isMobileValid = true;
            } else {
                System.out.println("Invalid Mobile Number: Should be 10 digits.");
            }

            if (user.getPassword() != null && user.getPassword().length() >= 8) {
                isPasswordValid = true;
            } else {
                System.out.println("Invalid Password: Minimum 8 characters required.");
            }

            if (user.getFullName() != null && !user.getFullName().isEmpty()) {
                isFullNameValid = true;
            } else {
                System.out.println("Invalid Full Name: Cannot be empty.");
            }


            return isEmailValid && isMobileValid && isPasswordValid && isFullNameValid && isGenderValid;
        }
    public void getUserDetails(){
        System.out.println("email : "+this.user.getEmail());
        System.out.println("mobile number : "+this.user.getMobileNumber());
        System.out.println("Password : "+this.user.getPassword());
        System.out.println("full Name : "+this.user.getFullName());

    }
    }


