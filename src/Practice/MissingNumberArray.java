package Practice;

public class MissingNumberArray {

    public static void main(String[] args) {

        int[] a = {1, 2, 4, 5};
        int sum1 = 0;
        int sum2 = 0;

        for (int sum : a) {
            sum1 = sum1 + sum;
        }
        System.out.println("Sum1 is : " + sum1);


        for (int i = 1; i <=5; i++) {
            sum2 = sum2 + i;
        }
        System.out.println("Sum 2 is : " + sum2);

        System.out.println("The missing number is : " + (sum2 - sum1));

    }
}
