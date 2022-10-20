package Practice;

public class LinearSearch {

    public static void main(String[] args) {

        int[] a = {10, 20, 40, 50, 30};

        int searchElement = 50;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == searchElement) {
                System.out.println("Element is found : " + i);
                break;
            }
        }
        System.out.println("Element not found");
    }
}
