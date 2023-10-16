package com.qa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TriangleTests {

    @Test
    void canCalculateTriangleArea() {

        Assertions.assertEquals(6, new Triangle(3.0, 4.0, 5.0).triangleArea());
    }

    @Test
    void canCalculateTrianglePerimeter() {
        Assertions.assertEquals(12.0, new Triangle(5.0, 4.0, 3.0).trianglePerimeter());
    }

    @Test
    void cannotCreateTrtiangleWithNegativeSide() {
        try {
            new Triangle(5.0, 4.0, -3.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            System.out.println(exception);
        }
    }

    @Test
    void cannotCreateTriangleWhenSumSidesLessThirdSide() {
        try {
            new Triangle(5.0, 2.0, 8.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            System.out.println(exception);
        }
    }

    @Test
    void testEqualityForTriangle() {
        var r1 = new Triangle(5.0, 4.0, 3.0);
        var r2 = new Triangle(5.0, 3.0, 4.0);
        var r3 = new Triangle(4.0, 3.0, 5.0);
        var r4 = new Triangle(4.0, 5.0, 3.0);
        var r5 = new Triangle(3.0, 4.0, 5.0);
        var r6 = new Triangle(3.0, 5.0, 4.0);
        Assertions.assertEquals(r1, r2);
        Assertions.assertEquals(r1, r3);
        Assertions.assertEquals(r1, r4);
        Assertions.assertEquals(r1, r5);
        Assertions.assertEquals(r1, r6);
    }
}
