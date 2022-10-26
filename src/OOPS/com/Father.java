package OOPS.com;

public class Father {

    private String address;
    private int rollNumber;


    public Father(String address, int rollNumber) {
        this.address = address;
        this.rollNumber = rollNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String eatPizza() {
        return "Pizza";
    }

    @Override
    public String toString() {
        return "Abstraction{" +
                "address='" + address + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }
}
