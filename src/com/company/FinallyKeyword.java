package com.company;

public class FinallyKeyword {
    public static void main(String[] args) {


        /* --->The finally block is always executed irrespective of whether an exception
        is raised or not inside the try block */

        // It never comes alone.Always in pairs--> try & finally or try,catch,finally

        try {
            int num = 10 / 0;
            System.out.println(num);
        } catch (ArithmeticException e) {
            System.out.println("Number is divided by zero!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong index of array!");
        } catch (Exception e) {
            System.out.println("Some error occurred");
        } finally {
            System.out.println("finally");
        }

        System.out.println("This statement is outside try-catch-finally blocks.");
    }
}

