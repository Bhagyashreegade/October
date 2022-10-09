package com.company;

public class Modulo {
    public static void main(String[] args) {

        //print even numbers between 1 to 10

        for (int i=1; i<=10; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }

        // second method to write even numbers between 1 to 10
        System.out.println("The even numbers between 1 to 10 using continue keyword :");
        for (int j= 1; j<=10; j++){
            if (j%2!=0){
                continue;
            }
            System.out.println(j);
        }


        //print odd numbers between 1 to 10
        System.out.println("The odd number between 1 to 10");
        for (int k=1; k<=10; k++){
            if(k%2!=0){
                System.out.println(k);

            }
        }

        //2nd method to print odd numbers
        System.out.println("The odd  numbers using continue keyword: ");
        for (int l=1; l<=10; l++){
            if(l%2==0){
                continue;
            } System.out.println(l);
        }
    }
}
