package Practice;

import java.util.Arrays;

public class ArrayEquality {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 6, 4, 5};

        boolean status= Arrays.equals(a, b);

        if(status== true){
            System.out.println("Both Arrays are equal");
        }else{
            System.out.println("Both Arrays are not equal");
        }

    }
}
