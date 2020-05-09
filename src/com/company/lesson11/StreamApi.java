package com.company.lesson11;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApi {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        strings.add("One");
        strings.add("One");
        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        strings.add("Four");
        strings.add("Five");
        strings.add("Six");
        strings.add("Seven");
        strings.add("Eight");
        strings.add("Nine");
        strings.add("Ten");

        strings.stream()
                .filter(string -> string.length() == 3)
                .map(Dog::new)
                .forEach(System.out::println);

        System.out.println("=================");

        strings.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("=================");

        strings.stream()
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);

        System.out.println("=================");

        Map<String, List<Dog>> map = strings.stream()
                .filter(string -> string.length() == 3)
                .map(Dog::new)
                .collect(Collectors.groupingBy(Dog::getName));

        map.forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println("=================");

        Optional<String> str = strings.stream()
                .filter(string -> string.length() == 30)
                .findFirst();

        System.out.println(str.orElse("not found"));
    }

    public static class Dog {

        String name;

        public Dog(String name) {
            this.name = "Dog" + name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

}
