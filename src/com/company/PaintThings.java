package com.company;

public class PaintThings {

    public static void main(String[] args) {

        final double COVERAGE = 350;

        //paint object created
        Paint p = new Paint(COVERAGE);

        Rectangle deck = new Rectangle("Rectangle", 20, 35);
        Sphere bigBall = new Sphere("Sphere", 15);
        Cylinder tank = new Cylinder("Cylinder", 10, 30);

        double deckAmount = p.amount(deck);
        double bigBallAmount = p.amount(bigBall);
        double tankAmount = p.amount(tank);

        System.out.println(deckAmount);
        System.out.println(bigBallAmount);
        System.out.println(tankAmount);


    }


}
