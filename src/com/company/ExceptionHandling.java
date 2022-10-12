package com.company;

public class ExceptionHandling {

    public static void main(String[] args) {

        System.out.println("Test 1");
        System.out.println("Test 2");


        /* ----> Exception e is the generic exception which is the parent of all the exception.It should be at the last exception
         while defining the specific exception
         */

        /* Execution will not stop if exception is handled */


        try {

            //a) ArithmeticException
            //int a= 10/0;

            // b)---> NullPointerException

            String name = null;
            name = name.toUpperCase();

        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Test 3");
        System.out.println("Test 4");


    }
}
