package com.company;

public class Bundle_Array {
    public static void main(String[] args) {

        //index always start from 0.therefore , index= length-1

        int[] numbers = {10, 20, 30, 40, 50};  //syntax-->1
        int sum = 0;

        //using for loop read the array & do the sum


        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            System.out.println(sum = sum + numbers[i]);
        }


        int[] numbers1 = new int[5];       //syntax--->2
        numbers1[0] = 10;
        numbers1[1] = 20;
        numbers1[2] = 30;
        numbers1[3] = 40;
        numbers1[4] = 50;
        System.out.println(numbers1[4]);


    }
}
