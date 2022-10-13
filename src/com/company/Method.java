package com.company;

public class Method {


    //calling a method 'without any return type'

    public static void main(String[] args) {

        addition(10, 20);
        multiplication(10, 20);

    }

    public static void addition(int a, int b) {
        System.out.println(a + b);
    }

    public static void multiplication(int a, int b) {
        System.out.println(a * b);
    }

}
