package com.company.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedExceptionTest {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            method2();
            reader.readLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static void method2() throws RuntimeException {
        throw new RuntimeException("runtime");
    }

}
