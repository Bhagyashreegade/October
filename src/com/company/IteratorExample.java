package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("Purple");

        System.out.println(list);


        Iterator<String> iterator = list.iterator();
        /*System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());*/  //---> NoSuchElementException

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }


}
