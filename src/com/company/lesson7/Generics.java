package com.company.lesson7;

public class Generics {

    public static void main(String[] args) {

        getSomething2(1);
        getSomething2("1111");
        getSomething2(new Person("1", "2", "3", 14));

    }

    public static <T, K> K getSomething(T a){
        return (K)a;
    }

    public static <T> void getSomething2(T a){
        System.out.println(a);
    }


}
