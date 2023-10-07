package com.qa.geometry;

import com.qa.geometry.figures.Rectangle;
import com.qa.geometry.figures.Square;

public class geometry {
    public static void main(String[] args) {
        Square.printSquareArea(7.0);
        Square.printSquareArea(5.0);
        Square.printSquareArea(3.0);

        Rectangle.printRectangleArea(3.0, 5.0);
        Rectangle.printRectangleArea(8.0, 6.0);
    }

}
