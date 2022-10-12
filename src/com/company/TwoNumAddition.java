package com.company;

import java.util.Scanner;

public class TwoNumAddition {

    //-----> Recursive loop

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        addNumber(sc);
    }

    public static void addNumber(Scanner sc) {

        System.out.println("Please enter number 1");
        int num1 = sc.nextInt();

        System.out.println("Please enter number 2");
        int num2 = sc.nextInt();

        System.out.println("Sum of two numbers " + (num1 + num2));

        System.out.println("If you want to continue press 1 or else press 2");

        int num = sc.nextInt();

        if (num == 1) {
            addNumber(sc);

        } else {
            System.out.println("End of the program");
        }


    }
}
