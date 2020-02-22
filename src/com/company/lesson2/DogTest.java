package com.company.lesson2;

public class DogTest {

    public static void main(String[] args) {
        Dog dog = new Dog("black", "mastiff 1", 10, 25);
        Dog dog2 = new Dog("black", "mastiff 2", 10, 21);

        System.out.println(dog.getBreed());
        System.out.println(dog.getColor());

        dog.setColor("white");

        System.out.println(dog.getBreed());
        System.out.println(dog.getColor());


        System.out.println(dog.fight(dog2) + " won!");
    }
}
