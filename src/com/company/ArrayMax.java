package com.company;

public class ArrayMax {
    public static void main(String[] args) {

        int [] number= {10,50,60,120,100};

        int maxNumber= 0;

        for (int i=0; i<number.length; i++){

            if (maxNumber < number[i]){
                maxNumber=number[i];
            }
        }
        System.out.println(maxNumber);
    }
}
