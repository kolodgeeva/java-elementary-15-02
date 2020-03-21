package com.company.lesson5.doers;

public class Duck implements Runnable, Swimmable, Flyable {
    @Override
    public void fly() {
        System.out.println("duck flies");
    }

    @Override
    public void run() {
        System.out.println("duck runs");
    }

    @Override
    public void swim() {
        System.out.println("duck swims");
    }
}
