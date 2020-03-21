package com.company.lesson5.doers;

public class Human implements Runnable, Swimmable {
    @Override
    public void run() {
        System.out.println("human runs");
    }

    @Override
    public void swim() {
        System.out.println("human swims");
    }
}
