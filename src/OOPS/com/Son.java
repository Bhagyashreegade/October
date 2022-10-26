package OOPS.com;

public class Son extends Father {
    public Son(String address, int rollNumber) {
        super(address, rollNumber);
    }
    public static void main(String[] args) {

        //tight coupling
        Father father = new Father("India", 12);
        System.out.println(father.getAddress());
        System.out.println(father.eatPizza());

        //loose coupling---> Using the Father class (parent class) to create an Object of Son (child class)

        Father father1 = new Son("Canada", 15);
        System.out.println(father1.getAddress());
        System.out.println(father1.eatPizza());

    }

    //over-riding method--->Son over-riding Father-->Runtime polymorphism

    public String eatPizza() {
        return "Sandwich";
    }
}
