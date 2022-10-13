package com.company;

public class Ternary {
    public static void main(String[] args) {

        int age = 19;
        String status;

        /*if(age>=18){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");

        }*/


        //using Ternary operator (Syntax ---> condition ? condition true : condition false)

        //1----> //System.out.println( age>=18? "Valid" : "Invalid");


        //2---->
        status = age >= 18 ? "Valid" : "Invalid";
        System.out.println(status);
    }
}
