package com.company.lesson10;

import java.util.function.Predicate;

public class TestFunctionalInterface {

    public static void main(String[] args) {

        MyPredicate myPredicate = x -> x > 0;
        System.out.println(myPredicate.test(10));   //true

        //Аналогично, но используется встроенный функциональный интерфейс java.util.function.Predicate
        Predicate<Integer> predicate = x -> x > 0;
        System.out.println(predicate.test(-10));    //false

    }
}
