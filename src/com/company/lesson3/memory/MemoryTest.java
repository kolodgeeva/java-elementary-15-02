package com.company.lesson3.memory;

import com.company.lesson3.Bicycle;
import com.company.lesson3.anon.Demo;

public class MemoryTest {

    public static void main(String[] args) {

        int number = 123;

        Bicycle bicycle = new Bicycle(10, "model2");

        Demo demo = new Demo();
        demo.print(bicycle);

    }

}
