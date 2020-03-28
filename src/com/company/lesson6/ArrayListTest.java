package com.company.lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        list.set(3, 100);

        System.out.println();

        for (Integer number: list) {
            System.out.print(number + " ");
        }

        list.add(3, 200);

        System.out.println();

        for (Integer number: list) {
            System.out.print(number + " ");
        }

        list.remove(3);
        list.remove(3);
        list.remove(3);

        System.out.println();

        for (Integer number: list) {
            System.out.print(number + " ");
        }

        System.out.println();

        System.out.println(list.indexOf(6));

        System.out.println(list.contains(100));
        System.out.println(list.contains(9));

        System.out.println(list);
        System.out.println(list.toString());

        Object[] array = list.toArray();
        List<Object> objectList = Arrays.asList(array);




    }


}
