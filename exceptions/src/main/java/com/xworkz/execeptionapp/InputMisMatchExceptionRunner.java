package com.xworkz.execeptionapp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMisMatchExceptionRunner {

    public static void main(String[] args) {
        System.out.println("Main started");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        try {
            int age = scanner.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Age is invalid");
        }
        System.out.println("main ended");
    }
}
