package com.company.lesson7;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("apples", 10);
        map.put("bananas", 20);

        System.out.println("size " + map.size());
        System.out.println("apples " + map.get("apples"));

        map.put("apples", 7);

        System.out.println("size " + map.size());
        System.out.println("apples " + map.get("apples"));

        map.put(null, 10);

        System.out.println();

        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println();

        map.forEach((key, value) -> System.out.println(key + " " + value));

        map.remove(null);

        System.out.println();

        map.forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println(map.containsKey("bananas"));
        System.out.println(map.containsKey("milk"));
    }
}
