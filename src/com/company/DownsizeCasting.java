package com.company;

public class DownsizeCasting {

    public static void main(String[] args) {


        int a= 10;
        int b= 30;

        System.out.println("The sum of a & b is: "  +  (a+b)); //concat

        //1st case
        int x= 25;
        float y= 25.3f;
        int m= x+(int)y;  //downsize casting
        System.out.println(m);


        //2nd case
        float g = 36.9f;
        double t= 56.2;
        float r = g + (float) t;
        System.out.println(r);



    }
}
