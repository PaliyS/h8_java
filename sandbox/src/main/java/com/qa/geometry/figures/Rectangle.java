package com.qa.geometry.figures;

public class Rectangle {
    public static void printRectangleArea(double v, double v1) {
        var text = String.format("Площадь Прямоуголника со стороной %f и %f = %f",v ,v1 , RectangleArea(v, v1));
        System.out.println(text);
        
    }

    private static double RectangleArea(double v, double v1) {
        return  v * v1;
    }
}
