package com.company.lesson7;

public class PersonTest {

    public static void main(String[] args) {

        Person person1 = new Person("marius", "", "miron", 17);
        Person person2 = new Person("misha", "", "bondarchuk", 16);

        Person person3 = person1;
        Person person4 = new Person("marius", "test", "miron", 17);

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

        System.out.println("person1 == person2 " + person1.equals(person2));

        System.out.println("person1 == person1 " + person1.equals(person1));
        System.out.println("person1 == person3 " + person1.equals(person3));

        System.out.println("person1 == null " + person1.equals(null));
        System.out.println("person1 == Object " + person1.equals(new Object()));
        System.out.println("person1 == person4 " + person1.equals(person4));

    }

}
