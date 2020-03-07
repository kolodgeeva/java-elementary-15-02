package com.company.lesson4.phone;

public class Phone extends AbstractPhone {

    public Phone(int year) {
        super(year);
    }

    @Override
    public void call(int number) {
        System.out.println("Вызываю номер " + number);
    }

    @Override
    public void ring(int number) {
        System.out.println("Телефон звонит");
    }
}
