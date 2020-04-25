package com.company.lesson10;

import java.util.LinkedList;
import java.util.List;

public class MethodReferenceTest {

    public MethodReferenceTest(String s) {
    }

    public static void main(String[] args) {

        List<String> strings = new LinkedList<>();
        strings.add("мама");
        strings.add("мыла");
        strings.add("раму");

        strings.forEach(System.out::println);
        strings.forEach(MethodReferenceTest::new);


    }
}
