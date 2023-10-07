package com.qa.geometry.figures;

public class Square {
   public static void printSquareArea(double a) {
       String text = String.format("Площадь квадрата со стороной %f = %f", a, SquareArea(a));
       System.out.println(text);
    }

    private static double SquareArea(double a) {
        return a * a;
    }
}
