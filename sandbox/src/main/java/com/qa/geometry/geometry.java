package com.qa.geometry;

import com.qa.geometry.figures.Rectangle;
import com.qa.geometry.figures.Square;
import com.qa.geometry.figures.Triangle;

public class geometry {
    public static void main(String[] args) {
        Square.printSquareArea(new Square(7.0));
        Square.printSquareArea(new Square(5.0));
        Square.printSquareArea(new Square(3.0));

        Rectangle.printRectangleArea(3.0, 5.0);
        Rectangle.printRectangleArea(8.0, 6.0);
        Triangle.printTriangleArea(new Triangle(5.0, 4.0, 3.0));
    }

}
