package com.company;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        List<String> name = new ArrayList<>();
        name.add("Bhagya");
        name.add("Urvi");
        name.add("Shreya");
        System.out.println("Before inserting any value in between : "  +name);

        //---> getting the value at particular index

        System.out.println("The value at index 1 is " + name.get(1));

        //--->inserting the value at particular index

        name.add(1, "Urvi2");
        System.out.println("After inserting the value at index 1 : " +name);

        //--->getting the index of particular value

        System.out.println("Shreya is preset at index : " + name.indexOf("Shreya"));

        //--->to check if the list is empty

        System.out.println("is the list empty? " +name.isEmpty());

        //---> to check the size of the arraylist(after inserting Urvi2

        System.out.println("The size of an arraylist is : " +name.size());

        //--->to remove particular value
        name.remove("Urvi2");
        System.out.println("After removing the object Urvi2 :" +name);

    }
}
