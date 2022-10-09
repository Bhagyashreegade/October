package com.company;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("This is the Calculator class");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a= sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("Operation to be performed");
        char operationType= sc.next().charAt(0);


        switch(operationType){

            case '+':
                System.out.println("Addition of a & b is :"  +  (a+b));
                break;

            case '-':
                System.out.println("Subtraction of a & b is :"  +  (a-b));
                break;

            case '*':
                System.out.println("Multiplication of a & b is:"  +  (a*b));
                break;

            case '/':
                System.out.println("Division of a & b is :"  +  (a/b));
                break;

        }

    }
}
