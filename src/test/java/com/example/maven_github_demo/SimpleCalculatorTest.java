
package com.example.maven_github_demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(50, SimpleCalculator.add(20, 10));
    }

    @Test
    public void testSubtract() {
        assertEquals(10, SimpleCalculator.subtract(20, 10));
    }

    @Test
    public void testMultiply() {
        assertEquals(200, SimpleCalculator.multiply(20, 10));
    }

    @Test
    public void testDivide() {
        assertEquals(2, SimpleCalculator.divide(20, 10));
    }

    @Test
    public void testDivideByZero() {
        assertEquals(0, SimpleCalculator.divide(20, 0));
    }

    @Test
    public void testNegativeNumbers() {
        assertEquals(-10, SimpleCalculator.add(-20, 10));
    }

    @Test
    public void testZero() {
        assertEquals(0, SimpleCalculator.add(0, 0));
    }

}
