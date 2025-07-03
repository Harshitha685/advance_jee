package com.xworkz.patientapp;

import com.xworkz.patientapp.dto.PatientDto;
import com.xworkz.patientapp.exception.DobNotFoundException;
import com.xworkz.patientapp.exception.NameNotFoundException;

public class PatientRunner {

    public static void main(String[] args) {
    try {
        String name = getPatientNameByDob("11-01-1995");
        System.out.println("Name : " +name);
    }catch (DobNotFoundException dnf){
        dnf.printStackTrace();
    }
    try{
      String dob = getDobByPatientName("Harsitha");
        System.out.println("Dob : " +dob);
    }catch (NameNotFoundException nnf){
        nnf.printStackTrace();
    }
    }

    public static String getPatientNameByDob(String dob) throws DobNotFoundException {
        PatientDto patientDto = new PatientDto();
        patientDto.setName("Harshitha");
        patientDto.setDateOfBirth("11-01-1995");

        if(patientDto.getDateOfBirth().equals(dob)){
            return patientDto.getName();
        }
        else {
            throw new DobNotFoundException("No user name found with dob " + dob);
        }
    }

    public static String getDobByPatientName(String name) throws NameNotFoundException {
        PatientDto patientDto = new PatientDto();
        patientDto.setName("Harshitha");
        patientDto.setDateOfBirth("11-01-1995");

        if(patientDto.getName().equalsIgnoreCase(name)) {
            return patientDto.getDateOfBirth();
        } else {
            throw new NameNotFoundException("No DOB found for patient with name: " + name);
        }
    }


}
