package com.company.lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SimpleComparator {

    public static void main(String[] args) {

        String[] array1 = {"мама", "мыла", "раму"};
        String[] array2 = {"я", "очень", "люблю", "java"};
        String[] array3 = {"мир", "труд", "май"};

        List<String[]> arrays = new ArrayList<>();
        arrays.add(array1);
        arrays.add(array2);
        arrays.add(array3);

        Comparator<String[]> compareByLength  = new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o1.length - o2.length;
            }
        };

        Comparator<String[]> compareByWordsLength = new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                int length1 = 0;
                int length2 = 0;
                for (String s : o1) {
                    length1 += s.length();
                }
                for (String s : o2) {
                    length2 += s.length();
                }
                return length1 - length2;
            }
        };

        for (String[] strings: arrays) {
            System.out.println(Arrays.toString(strings));
        }

        System.out.println("-----------------------");

        arrays.sort(compareByLength);
        for (String[] strings: arrays) {
            System.out.println(Arrays.toString(strings));
        }

        System.out.println("-----------------------");
        arrays.sort(compareByWordsLength);
        for (String[] strings: arrays) {
            System.out.println(Arrays.toString(strings));
        }
    }
}
