package com.company.lesson11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamFlatMap {

    public static void main(String[] args) {

        String[] strings = {"Java", "Course"};

        Arrays.stream(strings)
                .map(string -> string.split(""))
                .flatMap(Arrays::stream)
                .forEach(System.out::println);

        System.out.println("====================");

        IntStream.range(0, 10)
                .forEach(System.out::println);

        System.out.println("====================");

        Stream.of(2, 3 , 0, 1, 3)
                .flatMapToInt(number -> IntStream.range(0, number))
                .forEach(System.out::println);

        System.out.println("====================");

        Stream.of(2, 3 , 0, 1, 3)
                .map(number -> IntStream.range(0, number))
                .limit(3)
                .forEach(System.out::println);

        System.out.println("====================");

        IntStream.range(0, 10)
                .skip(5)
                .forEach(System.out::println);

        System.out.println("====================");

        Stream.of(2, 3 , 0, 1, 3)
                .distinct()
                .forEach(System.out::println);

        System.out.println("====================");

        System.out.println(Stream.of(2, 3 , 0, 1, 3)
                .distinct()
                .count());

        System.out.println("====================");

        List<Integer> list = Stream.of(2, 3 , 0, 1, 3)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("====================");

        String string = Stream.of("2", "3" , "0", "1", "3")
                .distinct()
                .collect(Collectors.joining(",", "[", "]"));

        System.out.println(string);

    }


}
