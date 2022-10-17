package com.company;

import java.util.*;

public class ListDuplicateRemoval {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Bhagya");
        list.add("Urvi");
        list.add("Kinjal");
        list.add("Urvi");
        list.add("Bhagya");

        //1---->The values that are duplicated

        /*for (int i = 0; i < list.size(); i++) {
            if (list.lastIndexOf(list.get(i)) != i) {
                System.out.println(list.get(i) + " is duplicated");
            }
        }*/

        //2----> how to print duplicates in ArrayList
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++)
                if (list.get(i) == list.get(j)) {
                    System.out.println("found duplicate element :" + list.get(i));
                }
        }

        // How many times each duplicate is present


        System.out.println(Collections.frequency(list, "Bhagya"));
        System.out.println(Collections.frequency(list, "Urvi"));

        //To check if it has duplicate values & remove duplicate from ArrayList--> By converting it into Set

        Set<String> s = new HashSet<String>(list);
        if (s.size() == list.size()) {
            System.out.println("The list doesn't have duplicate values");
        } else {
            System.out.println("The list has a duplicate value");
        }

        System.out.println("Before removing the duplicate: " + list);

        System.out.println("After removing the duplicates: " + s);


    }
}
