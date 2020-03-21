package com.company.lesson5.interfaces;

public class Cup implements Drawable, Marker {

    @Override
    public void draw() {
        System.out.println("Draw cup");
    }

    public void cupMethod() {
        System.out.println("Cup method");
    }
}
