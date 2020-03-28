package com.company.lesson6;

import java.util.ArrayList;
import java.util.Iterator;

public class CatList {

    public static void main(String[] args) {

        ArrayList<String> cats = new ArrayList<>();

        cats.add("Cat1");
        cats.add("Cat2");
        cats.add("Cat3");
        cats.add("Cat4");
        cats.add("Cat5");

        /*for (String cat: cats) {
            if (cat.equals("Cat3")) {
                cats.remove(cat);
            }
        }*/

        Iterator<String> iterator = cats.iterator();
        while (iterator.hasNext()) {
            String cat = iterator.next();
            if (cat.equals("Cat3")) {
                iterator.remove();
            }
        }

        for (String cat: cats) {
            System.out.println(cat);
        }

        cats.removeIf(cat -> cat.equals("Cat4"));

        for (String cat: cats) {
            System.out.println(cat);
        }


    }
}
