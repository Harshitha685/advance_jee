package com.xworkz.execeptionapp;

public class NullPointerExceptionRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        String string = "null";
        try {
            System.out.println(string.length());
        }catch (NullPointerException e){
            System.out.println("Please provide proper value");
        }

        System.out.println("main ended");
    }
}
