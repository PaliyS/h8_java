package com.qa.geometry.figures;

import java.util.Objects;

public record Rectangle(double v, double v1) {

    public Rectangle {
        if (v<0 || v1<0){
            throw new IllegalArgumentException("Прямоугольник не может иметь отрицательное значение стороны");
        }
    }

    public static void printRectangleArea(double v, double v1) {
        var text = String.format("Площадь Прямоуголника со стороной %f и %f = %f",v ,v1 , RectangleArea(v, v1));
        System.out.println(text);

    }

    private static double RectangleArea(double v, double v1) {
        return  v * v1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return (Double.compare(rectangle.v, this.v) == 0 && Double.compare(rectangle.v1, this.v1) == 0)
                || (Double.compare(rectangle.v, this.v1) == 0 && Double.compare(rectangle.v1, this.v) == 0);
    }

    @Override
    public int hashCode() {
        return Objects.hash(v, v1);
    }
}
