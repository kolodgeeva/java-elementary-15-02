package com.company.lesson6;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Test1");
        list.addLast("Test1");
        list.addFirst("Test1");

        for(String element: list) {
            System.out.println(element);
        }


    }

}
