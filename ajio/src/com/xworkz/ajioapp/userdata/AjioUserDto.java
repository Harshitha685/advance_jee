package com.xworkz.ajioapp.userdata;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class AjioUserDto
{
        private int id;
        private String email;
        private String mobileNumber;
        private String password;
        private String fullName;

//        public AjioUserDto() {
//        }
//
//        public void setEmail(String email) {
//            this.email = email;
//        }
//
//        public String getEmail() {
//            return email;
//        }
//
//        public void setMobileNumber(String mobileNumber) {
//            this.mobileNumber = mobileNumber;
//        }
//
//        public String getMobileNumber() {
//            return mobileNumber;
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
//        public void setGender(String gender) {
//            this.gender = gender;
//        }
//
//        public String getGender() {
//            return gender;
//        }
@Override
public String toString() {
        return "AjioUserDto(email:" + this.email + "," +
                "\n mobileNumber:" + this.mobileNumber + "," +
                "\n password:" + this.password + "," +
                "\n fullName:" + this.fullName + ")";


}
    }


