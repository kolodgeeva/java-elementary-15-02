package com.company.lesson5.chess.interfaces;

import com.company.lesson5.interfaces.Drawable;

public class Main {

    public static void main(String[] args) {

        ChessItem item = new Queen(10);
        King king = new King(20);

        System.out.println(item instanceof Queen);
        System.out.println(item instanceof ChessItem);
        System.out.println(item instanceof Drawable);
        System.out.println(item instanceof HasValue);
        System.out.println(item instanceof Element);

        draw(item);
        draw(king);

        System.out.println(compareValues(king, item));
        System.out.println(compareValues(item, king));

    }

    public static void draw(Drawable drawable) {
        drawable.draw();
    }

    public static boolean compareValues(HasValue value1, HasValue value2) {
        return value1.getValue() > value2.getValue();
    }


}
