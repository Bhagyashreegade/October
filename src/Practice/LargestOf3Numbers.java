package Practice;

import java.util.Scanner;

public class LargestOf3Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number one");
        int a = sc.nextInt();
        System.out.println("Please enter number two");
        int b = sc.nextInt();
        System.out.println("Please enter number three");
        int c = sc.nextInt();


        //1--->Approach 1 -using else if statement

//        if (a > b && a > c) {
//            System.out.println(a + "is largest");
//        } else if (b > a && b > c) {
//            System.out.println(b + "is the largest");
//        } else {
//            System.out.println(c + " is the largest");
//        }

        //2--->Using ternary operator


        int largest = a > b ? a : b;                                    //largest of a & b
        int largest1 = c > largest ? c : largest;                       //largest of c & largest
        System.out.println(largest1 + "is the largest number");
    }

}
