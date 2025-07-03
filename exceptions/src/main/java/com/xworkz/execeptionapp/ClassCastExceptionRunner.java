package com.xworkz.execeptionapp;

public class ClassCastExceptionRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Parent parent = new Child();
//        Child1 child1 = (Child) parent;
try {
    Child child = (Child) parent;
}catch (ClassCastException e){
    System.out.println("Invalid class");
}
        System.out.println("main ended");
    }
}
