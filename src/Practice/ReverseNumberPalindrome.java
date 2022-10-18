package Practice;

import java.util.Scanner;

public class ReverseNumberPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int org_num = num;

        //1---> Using while loop

        int reverse = 0;

        while (num != 0) {
            reverse = reverse * 10 + num % 10;  // 0*10 + 1234%10 = 4
            num = num / 10;                   // 1234/10 = 123-->eliminating the last number-->first iteration
        }
        System.out.println("After reversing the number, the number is..." + reverse);

        //2--->Using StringBuffer class

//        StringBuffer sb= new StringBuffer(String.valueOf(num));
//        StringBuffer rev = sb.reverse();
//        System.out.println("The reverse number is  :" + rev);

        //3---> Using StringBuilder class

//        StringBuilder sb1 = new StringBuilder();
//        sb1.append(num);
//        StringBuilder rev1 = sb1.reverse();
//        System.out.println("The reverse number is  :" + rev1);

        //To check if the number taken from user is palindrome

        if (org_num == reverse) {
            System.out.println("The given number is Palindrome");

        } else {
            System.out.println("The given number is not a Palindrome");
        }
    }
}


