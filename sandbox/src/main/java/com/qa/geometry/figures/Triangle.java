package com.qa.geometry.figures;

public record Triangle(double a, double b, double c) {


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


    }