package com.company.lesson5.doers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Please choose: human, ship, duck");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();

        Element element = createObject(input);

        if (element instanceof Flyable) {
            ((Flyable) element).fly();
        }

        if (element instanceof Runnable) {
            ((Runnable) element).run();
        }

        if (element instanceof Swimmable) {
            ((Swimmable) element).swim();
        }

    }

    public static Element createObject(String input) {
        switch (input) {
            case "human":
                return new Human();
            case "ship":
                return new Ship();
            case "duck":
                return new Duck();
            default:
                throw new IllegalArgumentException("pls enter correct string");
        }
    }

}
