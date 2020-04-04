package com.company.lesson7;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("apples");
        set.add("milk");

        for (String str: set) {
            System.out.println(str);
        }

        System.out.println(set.contains("apples"));

    }

}
