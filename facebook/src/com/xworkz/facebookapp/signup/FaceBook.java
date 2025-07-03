package com.xworkz.facebookapp.signup;
import com.xworkz.facebookapp.userdata.FaceBookUserDto;
public class FaceBook
{
    FaceBookUserDto user;
    public boolean userSignUp(FaceBookUserDto user) {
        this.user = user;
        return userValidation(user);
    }

    public boolean userValidation(FaceBookUserDto user) {
        boolean isEmailValid = false;
        boolean isPhoneValid = false;
        boolean isPasswordValid = false;
        boolean isFullNameValid = false;
        boolean isDobValid = false;

        if (user.getEmail() != null && user.getEmail().contains("@")) {
            isEmailValid = true;
        } else {
            System.out.println("Invalid Email: Please enter a valid email.");
        }

        if (user.getPhoneNumber() != null && user.getPhoneNumber().length() == 10) {
            isPhoneValid = true;
        } else {
            System.out.println("Invalid Phone Number: Must be 10 digits.");
        }

        if (user.getPassword() != null && user.getPassword().length() >= 8 && user.getPassword().length() <= 16) {
            isPasswordValid = true;
        } else {
            System.out.println("Invalid Password: Length should be 8–16 characters.");
        }

        if (user.getFullName() != null && !user.getFullName().isEmpty()) {
            isFullNameValid = true;
        } else {
            System.out.println("Invalid Name: Full name cannot be empty.");
        }

        if (user.getDateOfBirth() != null && !user.getDateOfBirth().isEmpty()) {
            isDobValid = true;
        } else {
            System.out.println("Invalid Date of Birth: Please enter your DOB.");
        }

        return isEmailValid && isPhoneValid && isPasswordValid && isFullNameValid && isDobValid;
    }
    public void getUserData(){
        System.out.println("email : "+this.user.getEmail());
        System.out.println("phone number : "+this.user.getPhoneNumber());
        System.out.println("Password : "+this.user.getPassword());
        System.out.println("full Name : "+this.user.getFullName());
        System.out.println("date of birth: "+this.user.getDateOfBirth());
    }
}


