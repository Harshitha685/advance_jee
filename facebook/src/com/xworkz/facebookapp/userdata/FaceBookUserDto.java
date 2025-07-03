package com.xworkz.facebookapp.userdata;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FaceBookUserDto
{

        private String email;
        private String phoneNumber;
        private String password;
        private String fullName;
        private String dateOfBirth;

//        public FaceBookUserDto() {
//        }

//        public void setEmail(String email) {
//            this.email = email;
//        }
//
//        public String getEmail() {
//            return email;
//        }
//
//        public void setPhoneNumber(String phoneNumber) {
//            this.phoneNumber = phoneNumber;
//        }
//
//        public String getPhoneNumber() {
//            return phoneNumber;
//        }
//
//        public void setPassword(String password) {
//            this.password = password;
//        }
//
//        public String getPassword() {
//            return password;
//        }
//
//        public void setFullName(String fullName) {
//            this.fullName = fullName;
//        }
//
//        public String getFullName() {
//            return fullName;
//        }
//
//        public void setDateOfBirth(String dateOfBirth) {
//            this.dateOfBirth = dateOfBirth;
//        }
//
//        public String getDateOfBirth() {
//            return dateOfBirth;
//        }

        @Override
        public String toString(){
                return "FaceBookUserDto-(email = "+this.email+"," +
                        "\nphone number = "+this.phoneNumber+"," +
                        "\npassword = "+this.password+"," +
                        "\nfull name = "+this.fullName+"," +
                        "\ndob = "+this.dateOfBirth+")";
        }
    }


