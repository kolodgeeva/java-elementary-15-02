package com.company.lesson5.bodyguard;

public class Main {

    public static void main(String[] args) {

        BodyGuard bodyGuard1 = new ConcreteBodyGuard(new Gun());
        BodyGuard bodyGuard2 = new BoxingBodyGuard(new Gun());

        Attacker attacker = new Attacker();

        bodyGuard1.saveClientLife(attacker);
        bodyGuard2.saveClientLife(attacker);

        Attacker attacker2 = new Attacker(new Gun());

        bodyGuard1.saveClientLife(attacker2);
        bodyGuard2.saveClientLife(attacker2);

    }

}
