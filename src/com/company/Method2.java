package com.company;

public class Method2 {
    public static void main(String[] args) {       //main method is the entry point for java to execute the code

        //calling a method 'with a return type'


        //directly consuming the value
        System.out.println(addition(10, 20));
        System.out.println(multiplication(10, 20));

        //storing it in a variable and later printing out

        int sum = addition(10, 20);
        System.out.println(sum);

        int multiply = multiplication(10, 20);
        System.out.println(multiply);
    }

    public static int addition(int a, int b) {
        return a + b;

    }

    public static int multiplication(int a, int b) {
        return a * b;

    }
}
