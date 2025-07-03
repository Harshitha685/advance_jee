package com.xworkz.execeptionapp;

public class StackRunner {

    public static void main(String[] args) {
        System.out.println("main started");
        try {
            method1();
        }catch (Exception e){
            e.printStackTrace();
       }
        System.out.println("main ended");
    }

    public static void method1(){
        System.out.println("method1 started");
//        try {
            method2();
//        }catch (NullPointerException e){
//            e.printStackTrace();
//        }
        System.out.println("method1 ended");
    }

    public static void method2() throws NullPointerException{
        System.out.println("method2 started");
        try {
            method3();
        }catch (NullPointerException np){
            np.printStackTrace();
        }
        System.out.println("method2 ended");
    }

    public static void method3() throws NullPointerException{
        System.out.println("method3 started");
        String st = null;
        System.out.println(st.length());
        System.out.println("method3 ended");
    }
}
