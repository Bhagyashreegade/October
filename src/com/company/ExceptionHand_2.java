package com.company;

import java.util.Scanner;

public class ExceptionHand_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter num1");
        int num1 = sc.nextInt();
        int num2 = 10;

        try {
            int result = num2 / num1;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("It is an invalid input");

        }


    }
}
