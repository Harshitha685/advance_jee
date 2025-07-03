package com.xworkz.execeptionapp;

public class ArithmeticExceptionRunner {

    public static void main(String[] args) {
        System.out.println("main started");

        int num = 4/0;
        try {
            System.out.println(num);
        }catch (ArithmeticException e){
            System.out.println("Provide proper number");
        }
        System.out.println("main ended");
    }
}
