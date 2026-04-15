package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));    // 验证 2+3=5
        assertEquals(0, calculator.add(-1, 1));   // 验证 -1+1=0
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(3, 2));  // 验证 3-2=1
        assertEquals(-2, calculator.subtract(1, 3)); // 验证 1-3=-2
    }
}
