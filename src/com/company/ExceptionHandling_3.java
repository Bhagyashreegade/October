package com.company;

public class ExceptionHandling_3 {

    //what if generic exception is handled first

    public static void main(String[] args) {
        String s= null;
        try{
            System.out.println(s.charAt(1));

        }catch(Exception e){
            System.out.println("Some error occurred");

        }
        /*catch(ArithmeticException e){
            System.out.println("please enter non-zero input");

        }
        catch(NullPointerException e){
            System.out.println("Please enter the correct array index ");

        }*/
    }
}
