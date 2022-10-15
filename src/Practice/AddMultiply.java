package Practice;

public class AddMultiply {
    public static void main(String[] args) {

        //add numbers 1 to 10
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println(sum);


        //multiply numbers 1 to 6

        int product = 1;
        for (int i = 1; i <= 6; i++) {
            product = product * i;
        }
        System.out.println(product);

    }
}
