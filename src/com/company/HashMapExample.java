package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {

    //key is always unique, value can be duplicate.
    //only ONE KEY  can be added as null
    //Using TreeMap the data can be sorted.null cannot be used as a key with TreeMap

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Bhagya");
        map.put(null, "Arjun");
        map.put(3, "Deepika");
        map.put(4, "Alia");


        //Return the value for specific key

        System.out.println("The value at key 4 is " + map.get(4));

        //this method--> for unique key, it will add new data

        map.putIfAbsent(5, "Rohan");
        System.out.println("For unique key, the map values are : " + map);

        //replace old value with new value at specified key

        map.replace(5, "Rohan", "Rahul");
        System.out.println("After replacing old value with new value " + map);

        //defines the size of Map

        System.out.println("The size of the map is " + map.size());

        //checks if the Map is empty

        System.out.println("Is map empty? " + map.isEmpty());

        //containsKey and containsValue will check if the Key and Value are present and return boolean
        System.out.println("The key is present? " + map.containsKey(3));
        System.out.println("The value is present? " + map.containsValue("Alia"));

        // remove value for specified key
        map.remove(3);
        System.out.println("After removing key 3 " + map);


    }
}
