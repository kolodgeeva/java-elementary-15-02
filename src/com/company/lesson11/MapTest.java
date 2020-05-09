package com.company.lesson11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.IntStream;

public class MapTest {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        IntStream.range(0, 11)
                .forEach(number -> map.putIfAbsent(number, "val"+number));

        map.forEach((key, value) -> System.out.println(key + " " + value));

        map.computeIfPresent(3, (key, oldValue) -> oldValue + key + "computed");
        System.out.println(map.get(3));


        Optional.ofNullable("Test").ifPresent(System.out::println);

        var list = new ArrayList<>();
        var stream = list.stream();

    }

}
