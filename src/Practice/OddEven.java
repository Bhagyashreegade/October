package Practice;

public class OddEven {
    public static void main(String[] args) {

        //print odd numbers between 1 to 10
        int count=0;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }


        //print even numbers between 1 to 10

        for (int j = 1; j <= 10; j++) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }

        //check whether the given numbers is odd or even

        int x=10;

        if(x%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }


    }
}
