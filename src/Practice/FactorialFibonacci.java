package Practice;

public class FactorialFibonacci {
    public static void main(String[] args) {

        //factorial of 6

        int num = 6;
        int factorial = 1;

        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("The factorial of 6 is " + factorial);

        //print first 10 numbers of fibonacci series-->0,1,1,2,3,5,8,13,21,34

        int a = 0;
        int b = 1;
        int c;

        for (int i = 1; i <=10; i++) {
            System.out.println(a + " ");
            c = a + b;
            a = b;
            b = c;
        }

    }
}
