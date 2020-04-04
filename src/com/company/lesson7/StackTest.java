package com.company.lesson7;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {

        Stack<Integer> strings = new Stack<>();

        strings.push(1);
        strings.push(2);
        strings.push(3);
        strings.push(4);
        strings.push(5);
        strings.push(666);

        System.out.println("on the top " + strings.peek());

        System.out.println("size " + strings.size());

        System.out.println("get top " + strings.pop());

        System.out.println("size " + strings.size());

        System.out.println("get top " + strings.peek());

    }
}
