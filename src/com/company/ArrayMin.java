package com.company;

public class ArrayMin {
    public static void main(String[] args) {

        int[] num = {10, 5, 70, 35, 56};
        int minNumber = num[0];

        for (int i = 0; i < num.length; i++) {
            if (minNumber > num[i]) {
                minNumber = num[i];
            }
        }
        System.out.println(minNumber);
    }
}
