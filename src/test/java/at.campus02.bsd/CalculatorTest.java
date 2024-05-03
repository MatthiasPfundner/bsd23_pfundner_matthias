package at.campus02.bsd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd1() {
        double result = calculator.add(7.5, 2.5);
        Assertions.assertEquals(10.0, result, 0.0000001);
    }

    @Test
    public void testAdd2() {
        double result = calculator.add(15.0, -15.0);
        Assertions.assertEquals(0.0, result, 0.0000001);
    }

    @Test
    public void testAdd3() {
        double result = calculator.add(15.0, 15.0);
        Assertions.assertEquals(30.0, result, 0.0000001);
    }

    @Test
    public void testMinus1() {
        double result = calculator.minus(15.0, 15.0);
        Assertions.assertEquals(0.0, result, 0.0000001);
    }

    @Test
    public void testMinus2() {
        double result = calculator.minus(-15.0, 15.0);
        Assertions.assertEquals(-30.0, result, 0.0000001);
    }

    @Test
    public void testMinus3() {
        double result = calculator.minus(5.0, 7.5);
        Assertions.assertEquals(-2.5, result, 0.0000001);
    }

    @Test
    public void testDivide1() {
        double result = calculator.divide(10.0, 2.0);
        Assertions.assertEquals(5.0, result, 0.0000001);
    }

    @Test
    public void testDivide2() {
        double result = calculator.divide(11.0, 2.0);
        Assertions.assertEquals(5.5, result, 0.0000001);
    }

    @Test
    public void testDivide3() {
        double result = calculator.divide(1.0, 100.0);
        Assertions.assertEquals(0.01, result, 0.0000001);
    }

    @Test
    public void testMultiply1() {
        double result = calculator.multiply(5.0, 100.0);
        Assertions.assertEquals(500.0, result, 0.0000001);
    }

    @Test
    public void testMultiply2() {
        double result = calculator.multiply(2.5, 3.0);
        Assertions.assertEquals(7.5, result, 0.0000001);
    }

    @Test
    public void testMultiply3() {
        double result = calculator.multiply(-0.1, 0.1);
        Assertions.assertEquals(-0.01, result, 0.0000001);
    }
}
