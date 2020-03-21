package com.company.lesson5.interfaces;

public class Lemon implements Drawable {
    @Override
    public void draw() {
        System.out.println("draw Lemon");
    }

    public void lemonMethod() {
        System.out.println("Lemon method");
    }
}
