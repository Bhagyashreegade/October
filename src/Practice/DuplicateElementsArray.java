package Practice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsArray {

    public static void main(String[] args) {
        String[] arr = {"Java", "C", "C++", "Python", "Java"};

        //1---> Using for loop


//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//
//                if (arr[i] == arr[j]) {
//                    System.out.println("Duplicate elements are : " + arr[i]);
//                }
//            }
//        }


        //2--->Using Hashset approach

        HashSet<String> s = new HashSet<>();

        for (String a : arr) {
            if (s.add(a) == false) {
                System.out.println("Found Duplicate element : " + a);
            }

        }
    }
}

