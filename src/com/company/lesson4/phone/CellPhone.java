package com.company.lesson4.phone;

public class CellPhone extends WirelessPhone {

    public CellPhone(int year, int hours) {
        super(year, hours);
    }

    @Override
    public void call(int number) {
        System.out.println("вызываю " + number);
    }

    @Override
    public void ring(int number) {
        System.out.println("звонит " + number);
    }
}
