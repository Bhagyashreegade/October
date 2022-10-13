package com.company;

public abstract class Shape {
    //public static void main(String[] args) {

    //an instance variable name
    private String shapeName;


    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    //an abstract method area

    abstract double area();

    // a toString method

    @Override
    public String toString() {
        return "Shape{" +
                "shapeName='" + shapeName + '\'' +
                '}';
    }
}





