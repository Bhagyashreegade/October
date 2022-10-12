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

            /*if in catch block instead of Arithmetic excptn, IndexOutOfBound exception was written, the execution will stop and
            will not print anything further*/

        } catch (ArithmeticException e) {
            System.out.println("It is an invalid input");
        }

        //matter of sequence in exception--> Child exception first and the generic exception always comes last
        //if generic block is defined, then it must be defined after all the other catch blocks

        catch(Exception e){
            System.out.println(e);

        }

        System.out.println("This statement is outside try-catch block");

    }
}
