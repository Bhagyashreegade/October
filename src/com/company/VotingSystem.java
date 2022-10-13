package com.company;

public class VotingSystem {

    public static void main(String[] args) {
        Person person1 = new Person("Bhagya", "Female", 28);
        Person person2 = new Person("David", "male", 25);
        Person person3 = new Person("John", "male", 16);

        Person[] p = {person1, person2, person3};

        for (Person person : p) {
            if (person.getGender() == "male" && person.getAge() > 18) {
                System.out.println("The name of the person who is male and age is greater than 18 is " + person.getName());
            }
            try {
                if (person.getAge() < 18) {
                    throw new InvalidAgeException("The age is less than 18");
                }
            } catch (InvalidAgeException e) {
                System.out.println("An Exception is thrown for " + person.getName());

            }
        }
    }
}




