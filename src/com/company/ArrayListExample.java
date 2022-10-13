package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Duplicates are allowed in ArrayList

public class ArrayListExample {

    public static void main(String[] args) {

        //Collections always work with Wrapper class & not the primitive data types

        List<String> name = new ArrayList<>();
        name.add("Bhagya");
        name.add("Urvi");
        name.add("Shreya");
        name.add("Ravi");
        name.add("Sonam");
        name.add("Saajan");

        //---> Using lambda expression --replace all method

        /* name.replaceAll(e -> e.toUpperCase());
        System.out.println("Before inserting any value in between : " + name);*/

        //---> getting the value at particular index

        System.out.println("The value at index 1 is " + name.get(1));

        //--->inserting the value at particular index

        name.add(1, "Urvi2");
        System.out.println("After inserting the value at index 1 : " + name);

        //--->getting the index of particular value

        System.out.println("Shreya is preset at index : " + name.indexOf("Shreya"));

        //--->to check if the list is empty

        System.out.println("is the list empty? " + name.isEmpty());

        //---> to check the size of the arraylist(after inserting Urvi2

        System.out.println("The size of an arraylist is : " + name.size());

        //--->to remove particular value
        name.remove("Urvi2");
        System.out.println("After removing the object Urvi2 :" + name);

        //--->Sorting the arraylist
        Collections.sort(name);
        System.out.println("ArrayList after sorting : " + name);

        //---> To check if the value is present in ArrayList

        System.out.println("Is the given value present in ArrayList ? " + name.contains("Bhagya"));

        //---> Contains method using if statement

        if (name.contains("Shreya")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        //removing same value from two different ArrayList

        List<String> name2 = new ArrayList<>();
        name2.add("Shreya");
        name2.add("Saajan");
        name2.add("Sonam");
        name.removeAll(name2);
        System.out.println("After removing from Arraylist having variable 'name' : " + name);

    }
}
