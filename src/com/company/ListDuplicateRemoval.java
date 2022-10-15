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

        //The values tha t are duplicated

        for (int i = 0; i < list.size(); i++) {
            if (list.lastIndexOf(list.get(i)) != i) {
                System.out.println(list.get(i) + " is duplicated");
            }
        }

        //how many times each duplicate is present


        System.out.println(Collections.frequency(list, "Bhagya"));
        System.out.println(Collections.frequency(list, "Urvi"));

        //remove duplicate from ArrayList--> By converting it into Set

        System.out.println("Before removing the duplicate: " + list);

        Set<String> s = new HashSet<String>(list);

        System.out.println("After removing the duplicates: " + s);


    }
}
