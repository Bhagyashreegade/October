package com.company;

import java.util.Scanner;

public class Sep10_Homework {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of size of array");
        int size = sc.nextInt();
        int[] a = new int[size];

        int b = 0;

        System.out.println("Enter the elements of an array");

        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Array elements are:  ");

        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
        }
        //to find the max number

        int maxNumber = 0;

        for (int i = 0; i < a.length; i++) {

            if (maxNumber < a[i]) {
                maxNumber = a[i];
            }
        }
        System.out.println("The max number is: " + maxNumber);

        //to find the minimum number

        int minNumber = a[0];

        for (int i = 0; i < a.length; i++) {
            if (minNumber > a[i]) {
                minNumber = a[i];
            }
        }
        System.out.println("The minimum number is: " + minNumber);

        //sort array in descending order

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    b = a[i];
                    a[i] = a[j];
                    a[j] = b;
                }
            }
        }
        System.out.println("Elements of array sorted in descending order: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }


    }


}
