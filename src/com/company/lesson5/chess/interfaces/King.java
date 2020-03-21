package com.company.lesson5.chess.interfaces;

public class King extends ChessItem {

    public King(int value) {
        super(value);
    }

    @Override
    public void draw() {
        System.out.println("Draw King");
    }
}
