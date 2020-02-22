package com.company.lesson2;

public class References {

    public static void main(String[] args) {
        int number = 5;
        System.out.println("before call " + number);
        changeNumber(number);
        System.out.println("after call " + number);

        System.out.println("________________________-");

        Cat cat = new Cat();
        cat.name = "Name";
        System.out.println("before call " + cat.name);
        changeCat(cat);
        System.out.println("after call " + cat.name);

        Cat cat3 = null;
        System.out.println(cat3);

        cat = null;
        changeCat(cat);
        System.out.println(cat);

    }

    public static void changeNumber(int number) {
        System.out.println("input number " + number);
        number = 10;
        System.out.println("after change " + number);
    }

    public static void changeCat(Cat cat) {

        if (cat == null) {
            System.out.println("cat is null");
            return;
        }

        System.out.println("input cat " + cat.name);
        cat.name = "New name";
        System.out.println("after change " + cat.name);
    }

}
