package Practice;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        int a = 12;
        int b = 25;

        //1-->using third variable 'c'
        System.out.println("Before swapping the numbers..." + a + "   " + b);
        /*int c = a;
        a = b;
        b = c;*/


        //2--->Without using third variable--with + & -

        /*a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping the numbers..." + a + "   " + b);*/

        //3--->using * & / operator where a & b values should be non zero

       /* a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("After swapping the numbers..." + a + "   " + b); */

        //4--->Using single statement

        b = a + b - (a = b);
        System.out.println("After swapping the numbers..." + a + "   " + b);


    }
}
