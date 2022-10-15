package Practice;

import java.util.Scanner;

public class UserInput {

    //Take input from user.If that number is between 1 to 100, print congrats.


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The number is between 1 to 100");
        int i = sc.nextInt();

        if (i > 1 && i < 100) {
            System.out.println("Congrats");
        } else {
            System.out.println("Invalid input");
        }

    }
}
