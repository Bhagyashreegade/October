package Practice;

public class Loops {

    public static void main(String[] args) {

        //1--->print numbers 1 to 10 using for loop

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

        }
        System.out.print("\n");


        //2--->print numbers 1 to 10 using while loop

        int a = 1;
        while (a <= 10) {
            System.out.println(a);
            a++;
        }
        System.out.print("\n");

        //3--->print numbers 1 to 10 using do-while loop
        int b = 1;
        do {
            System.out.println(b);
            b++;
        } while (b <= 10);


        //4--->infinite loop

       /* while(true){
            System.out.println("hello");
        }*/


        //5---> using break keyword , breaking the infinite loop

        int x = 1;
        while (true) {
            System.out.println(x);
            if (x == 5) {
                break;
            }
            x++;
        }
    }
}
