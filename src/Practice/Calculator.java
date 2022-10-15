package Practice;

public class Calculator {
    public static void main(String[] args) {

        System.out.println(add(2, 2));
        System.out.println(multiply(3, 2));
        System.out.println(divide(10, 5));
        System.out.println(substract(15, 5));

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int substract(int a, int b) {
        return a - b;
    }


}
