package com.company.lesson3.anon;

import com.company.lesson3.Bicycle;

public class Demo {

    public void show() {
        System.out.println("Show demo");
    }

    public void print(Bicycle bicycle) {

        if (bicycle != null) {
            return;
        }

        String bicycleString = bicycle.toString();
        System.out.println(bicycleString);
    }

}
