package com.company;

public class Sphere extends Shape{
    private double radius;

    public Sphere(String shapeName, double radius) {
        super(shapeName);
        this.radius = radius;
    }

    public double area(){
        return 4*Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + radius +
                '}';
    }
}
