package Practice;

public class Pattern_2 {
    public static void main(String[] args) {


        //Q.1 Print inverted half pyramid (rotated by 180 deg)


        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5 - i; j++) {  //inner loop for space print
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {   //inner loop for star print
                System.out.print("*");
            }
            System.out.println();
        }

    }
}



