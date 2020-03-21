package com.company.lesson5.chess.abstactclasses;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<ChessItem> items = new ArrayList<>();

        items.add(new Queen());
        items.add(new King());
        items.add(new King());
        items.add(new WhitePawn());
        items.add(new WhitePawn());
        items.add(new WhitePawn());

        drawChessItems(items);

    }

    public static void drawChessItems(List<ChessItem> items) {
        for (ChessItem item: items) {
            item.draw();
        }
    }
}
