package Practice;

public class CountNumOfDigits {
    public static void main(String[] args) {


        int a = 1245;
        int countNum = 0;

        while (a > 0) {
            a = a / 10;
            countNum++;
        }
        System.out.println("The number of digits in a given number is :" + countNum);
    }
}
