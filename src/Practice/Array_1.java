package Practice;

public class Array_1 {

    public static void main(String[] args) {

        //1--->Declare an array to hold 10 decimal values and calculate sum of this values.-double nums [10]

        double nums[] = {1.4, 2.5, 2.5, 3.6, 3.9, 4.2, 4.8, 4.0, 3.1, 2.3};
        double sum = 0;
        System.out.println("Sum of the value is: ");
        for (double i = 0; i < nums.length; i++) {
            sum = sum + nums[(int) i];
        }
        System.out.print(sum);

        {
            System.out.println();
        }

        //2--->declare an array to hold 6 values and calculate the product of them

        int[] productarr = {1, 2, 3, 4, 5, 6};
        int product = 1;

        for (int j = 1; j < productarr.length; j++) {
            product = product * productarr[j];
        }
        System.out.println("The product of an array is " + product);

        //3---> declare an array of char and store your first name.

        char[] Firstname = {'B', 'h', 'a', 'g', 'y', 'a'};
        for (char c : Firstname) {
            System.out.print(c);
        }
        System.out.println("\t");

        //4--->find the max number in given array

        int[] arr = {10, 30, 45, 100, 28, 27};
        int maxNumber = 0;

        for (int i = 0; i < arr.length; i++) {
            if (maxNumber < arr[i]) {
                maxNumber = arr[i];

            }
        }
        System.out.println("The max number in given array is " + maxNumber);


        //5--->find the minimum number in given array

        int[] arr1 = {24, 8, 120, 56, 21};
        int minNumber = arr1[0];

        //reading value of array using for each loop

        for (int y : arr1) {
            System.out.print(y + " , ");

        }

        for (int x = 0; x < arr1.length; x++) {
            if (minNumber > arr1[x]) {
                minNumber = arr1[x];
            }
        }
        System.out.println("The minimum number in given array is " + minNumber);


    }
}

