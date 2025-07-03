package com.xworkz.execeptionapp;

import java.util.Arrays;

public class ArrayIndexExceptionRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        String pinCodes[]={"560010","560020","560030"};
//        System.out.println(pinCodes[7]);
        try {
            System.out.println(pinCodes[7]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index value");
        }

        System.out.println("main ended");
    }
}
