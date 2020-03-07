package com.company.lesson4.phone;

public abstract class WirelessPhone extends AbstractPhone {

    private int hours;

    public WirelessPhone(int year, int hours) {
        super(year);
        this.hours = hours;
    }

}
