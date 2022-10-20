package Practice;

public class EvenOddFromArray {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};

        //1---> Extracting even numbers

//        for (int i = 0; i < a.length; i++) {
//            if (a[i] % 2 == 0) {
//                System.out.println("The even numbers are :" + a[i]);
//            }
//        }
        //1A---> Using for each loop
        for (int even : a) {
            if (even % 2 == 0) {
                System.out.println(even);

            }
        }

        //2---> Extracting odd numbers

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                System.out.println("The odd numbers are :" + a[i]);
            }
        }

    }
}
