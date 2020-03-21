package com.company.lesson5.chess.abstactclasses;

public abstract class ChessItem {

    int x, y;
    int value;

    public int getValue() {
        return this.value;
    }

    public abstract void draw();

}
