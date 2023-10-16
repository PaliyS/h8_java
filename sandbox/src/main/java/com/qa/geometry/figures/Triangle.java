package com.qa.geometry.figures;

import java.util.Objects;

public record Triangle(double a, double b, double c) {

    public Triangle {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("Треугольник со стороной меньше нуля не может существовать");
        }
        if (a + b < c || a + c < b || c + b < a) {
            throw new IllegalArgumentException("Сумма двух сторон треугольника не может быть больше третьей стороны");
        }
    }


    public static void printTriangleArea(Triangle abc) {
        String text = String.format("Площадь треугольника со сторонами %f, %f, %f = %f", abc.a, abc.b, abc.c, abc.triangleArea());
        System.out.println(text);
    }

    public double trianglePerimeter(){
        return this.a + this.b + this.c;
    }

    public double triangleArea(){
        double p = trianglePerimeter()/2;
        return Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return (Double.compare(triangle.a, this.a) == 0 && Double.compare(triangle.b, this.b) == 0 && Double.compare(triangle.c, this.c) == 0)
                || (Double.compare(triangle.a, this.a) == 0 && Double.compare(triangle.b, this.c) == 0 && Double.compare(triangle.c, this.b) == 0)
                || (Double.compare(triangle.a, this.c) == 0 && Double.compare(triangle.b, this.a) == 0 && Double.compare(triangle.c, this.b) == 0)
                || (Double.compare(triangle.a, this.c) == 0 && Double.compare(triangle.b, this.b) == 0 && Double.compare(triangle.c, this.a) == 0)
                || (Double.compare(triangle.a, this.b) == 0 && Double.compare(triangle.b, this.a) == 0 && Double.compare(triangle.c, this.c) == 0)
                || (Double.compare(triangle.a, this.b) == 0 && Double.compare(triangle.b, this.c) == 0 && Double.compare(triangle.c, this.a) == 0)
                ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
}