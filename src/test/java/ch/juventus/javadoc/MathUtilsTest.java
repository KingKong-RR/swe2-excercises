package ch.juventus.javadoc;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {
    @Test
    public void testAdditiom() {
        // given
        MathUtils mathUtils = new MathUtils();
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(1.0);
        // when
        double result = mathUtils.addition(numbers);
        // then
        assertEquals(2, result, "Optional failure message");
    }

    @Test
    public void testSubstraction() {
        // given
        MathUtils mathUtils = new MathUtils();
        // when
        double result = mathUtils.subtraction(4, 2);
        // then
        assertEquals(2, result, "Optional failure message");
    }

    @Test
    public void testDivision() {
        // given
        MathUtils mathUtils = new MathUtils();
        // when
        double result = mathUtils.divison(4, 2);
        // then
        assertEquals(5, result, "Optional failure message");
    }

    @Test
    public void testMultiplication() {
        // given
        MathUtils mathUtils = new MathUtils();
        // when
        double result = mathUtils.multiplication(1, 2);
        // then
        assertEquals(2, result, "Optional failure message");
    }
    /*@Test
    void shouldThrowException() {
        Exception exception = assertThrows(
                ArithmeticException.class,
                () -> calculator.divide(1, 0));
        assertEquals("/ by zero", exception.getMessage());
    }
     */
}