package com.company.lesson4.phone;

public class Smartphone extends CellPhone {

    private String os;

    public Smartphone(String os, int year, int hours) {
        super(year, hours);
        this.os = os;
    }

    public void install(String app) {
        System.out.println("Устанавливаю " + app);
        unpack();
        removeFiles();
    }

    private void unpack() {

    }

    private void removeFiles() {

    }

}
