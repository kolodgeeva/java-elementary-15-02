package com.company.lesson5.chess.interfaces;

import com.company.lesson5.interfaces.Drawable;

public interface Element extends HasValue, Drawable {

    int getX();
    int getY();

}
