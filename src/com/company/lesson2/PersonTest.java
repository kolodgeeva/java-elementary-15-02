package com.company.lesson2;

public class PersonTest {

    public static void main(String[] args) {

        Person person = new Person();

        System.out.println(person.name);
        System.out.println(person.age);

        Person person1 = new Person("With name");

        System.out.println(person1.name);
        System.out.println(person1.age);

        Person person2 = new Person(12);

        System.out.println(person2.name);
        System.out.println(person2.age);

        String someName = "Default name";
        int someAge = 1;
        Person person3 = new Person(someName, someAge);

        System.out.println(person3.name);
        System.out.println(person3.age);

        person1 = person;
        if (person == person1) {
            System.out.println("persons are equal");
        }

        if (person1 == person3) {
            System.out.println("persons are equal");
        } else {
            System.out.println("persons are not equal");
        }

    }

}
