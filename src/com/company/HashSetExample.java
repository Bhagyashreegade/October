package com.company;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    //Duplicates are not allowed in Set

    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();

        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(2);  //-->duplicate value will not be printed in sout statement

        System.out.println("The numbers in HashSet are : " + numbers);

        //Collections are dynamic in nature

        numbers.add(6);
        System.out.println("After adding the number :" + numbers);

    }
}
