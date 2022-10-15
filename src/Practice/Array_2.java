package Practice;

public class Array_2 {
    public static void main(String[] args) {
        //1--->sorting array in descending order


        int[] a = {2, 6, 5, 3, 10};
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    b = a[i];
                    a[i] = a[j];
                    a[j] = b;
                }
            }
        }
        System.out.println("Elements of array sorted in descending order: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }


        //2--->sorting array in ascending order
        int[] x = {2, 6, 5, 3, 10};
        int y = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] > x[j]) {
                    y = x[i];
                    x[i] = x[j];
                    x[j] = y;
                }
            }
        }
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i] + " ");
        }
    }
}
