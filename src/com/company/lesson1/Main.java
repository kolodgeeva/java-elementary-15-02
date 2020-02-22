package com.company.lesson1;

import com.company.lesson2.Person;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        person.name = "Test";

        System.out.println(factRecursion(5));

    }

    private static int fact(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    private static int factRecursion(int n) {
        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * factRecursion(n - 1);
        return result;

    }
}
