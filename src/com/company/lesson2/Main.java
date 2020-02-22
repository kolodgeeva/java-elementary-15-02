package com.company.lesson2;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Cat cat1 = new Cat();

        cat.age = 3;
        cat.name = "Vasia";

        System.out.println(cat);
        System.out.println(cat1);
        System.out.println(cat.age);
        System.out.println(cat.name);

        cat.run();

        cat1 = cat;

        System.out.println(cat);
        System.out.println(cat1);

        cat1.name = "Marysia";
        cat1.age = 2;

        System.out.println(cat1.age);
        System.out.println(cat1.name);

        System.out.println(cat.age);
        System.out.println(cat.name);

    }

}
