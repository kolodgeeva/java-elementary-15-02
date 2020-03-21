package com.company.lesson5.bodyguard;

public class BoxingBodyGuard extends BodyGuard {

    public BoxingBodyGuard(Gun gun) {
        super(gun);
    }

    @Override
    void applyMartialArts(Attacker attacker) {
        boxing();
    }

    private void boxing() {
        System.out.println("boxing");
    }

}
