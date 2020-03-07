package com.company.lesson4.cow;

public class Whale extends Cow {

    public void printName() {
        System.out.println("Я - кит");
    }

    public void whaleMethod() {
        super.printName();
        this.printName();
        System.out.println("whale method");
    }

}
