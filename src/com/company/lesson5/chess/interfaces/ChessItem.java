package com.company.lesson5.chess.interfaces;

public abstract class ChessItem implements Element {

    int x, y, value;

    public ChessItem() {
    }

    public ChessItem(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }
}
