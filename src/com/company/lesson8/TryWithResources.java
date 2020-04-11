package com.company.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {

    public static void main(String[] args) {

        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String str = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
