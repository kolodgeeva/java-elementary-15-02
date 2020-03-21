package com.company.lesson5.chess.abstactclasses;

public class WhitePawn extends Pawn {

    @Override
    public void draw() {
        super.draw();
        System.out.println("Draw white pawn");
    }
}
