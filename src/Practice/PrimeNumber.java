package Practice;

public class PrimeNumber {

    /*prime numbers are those numbers
    1--> natural number >1
    2--> has only two factors 1 & itself*/

    public static void main(String[] args) {

        int num = 3;
        int count = 0;

        if (num > 1) {   //will check first condition(natural number > 1)

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) ;
                count++;
            }
            if (count == 2) {
                System.out.println("Prime number");
            } else {
                System.out.println("not a Prime number");   // this else is for second condition (has only two factors 1 & itself))
            }

        } else {                                           //this else is for first condition
            System.out.println("Not a Prime number");
        }


    }
}
