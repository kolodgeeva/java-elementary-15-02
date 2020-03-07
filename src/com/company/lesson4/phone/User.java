package com.company.lesson4.phone;

public class User {

    String name;

    public User(String name) {
        this.name = name;
    }

    public void callAnotherUser(int number, AbstractPhone phone) {
        phone.call(number);
    }

}
