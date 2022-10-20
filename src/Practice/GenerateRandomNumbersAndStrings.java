package Practice;

import java.util.Random;

public class GenerateRandomNumbersAndStrings {
    public static void main(String[] args) {


        //1---> creating an Random Object

        Random r= new Random();
        int i = r.nextInt(10);  //if bound is 10,numbers will be generated between 0 to 9
        System.out.println(i);

        double v = r.nextDouble();     //generate random numbers between 0.0 to 1.0
        System.out.println(v);


        //2---> Using Math class


        double random = Math.random();
        System.out.println(random);


        //3---> Using APache langs-->lang API----> Program#12---> http:// commons.apache.org







    }
}
