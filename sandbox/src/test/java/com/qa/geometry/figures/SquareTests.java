package com.qa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTests {

    @Test
    void canCalculateArea() {
        var a = new Square(5.0);
        double result = a.area();
        Assertions.assertEquals(25.0, result);
    }

    @Test
    void canCalculatePerimeter () {
        Assertions.assertEquals(20.0, new Square(5.0).perimeter());
    }

}
