package Practice;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        System.out.println("This is the Calculator practice");
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the value of a");
        int a = sc.nextInt();
        System.out.println("please enter the value of b");
        int b = sc.nextInt();
        System.out.println("please enter the operation to be performed");
        char operation = sc.next().charAt(0);


        switch (operation) {
            case '+':
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                System.out.println(a / b);
                break;


        }
    }
}
