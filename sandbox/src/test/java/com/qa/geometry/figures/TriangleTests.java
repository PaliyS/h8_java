package com.qa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TriangleTests {

    @Test
    void canCalculateTriangleArea() {

        Assertions.assertEquals(6, new Triangle(3.0, 4.0,5.0).triangleArea());
    }

    @Test
    void canCalculateTrianglePerimeter () {
        Assertions.assertEquals(12.0, new Triangle(5.0, 4.0, 3.0).trianglePerimeter());
    }
}
