package com.company;

public class CommandLine {

    public static void main(String[] args) {
        System.out.println("Hello");

        for (String arg: args) {
            System.out.println(arg);
        }
    }

}
