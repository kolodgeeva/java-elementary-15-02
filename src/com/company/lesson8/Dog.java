package com.company.lesson8;

import java.util.ArrayList;
import java.util.List;

public class Dog {

    Boolean hasCollar;
    Boolean hasMuzzle;

    public Dog(Boolean hasCollar, Boolean hasMuzzle) {
        this.hasCollar = hasCollar;
        this.hasMuzzle = hasMuzzle;
    }

    public void walk() throws DogIsNotReadyException {
        if (!hasCollar || !hasMuzzle) {
            throw new DogIsNotReadyException("Dress your dog pls");
        }
        System.out.println("walk");
    }

    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog(true, false));
        dogs.add(new Dog(false, false));
        dogs.add(new Dog(true, true));

        for (Dog dog: dogs) {
            try {
                dog.walk();
            } catch (DogIsNotReadyException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
