package com.company;

public class Keyword_This {


    //----> accessing properties of current class

    String name;
    int rollNumber;


    // ----> accessing the constructor of current class

    public Keyword_This(String name, int rollNumber) {
        this(rollNumber);
        this.name = name;


    }

    public Keyword_This(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    //----> accessing method of current class

    public void method1() {
        System.out.println("This is method 1");
    }

    public void method2() {
        this.method1();
    }


}

