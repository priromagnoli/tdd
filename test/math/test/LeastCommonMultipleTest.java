package math.test;

import org.junit.Test;

import static math.NumberTheory.lcm;
import static org.junit.Assert.assertEquals;

public class LeastCommonMultipleTest {
    @Test
    public void resultOfMultiplication() {
        assertEquals(6, lcm(3, 2));
    }

    @Test
    public void equalNumbers() {
        assertEquals(3, lcm(3, 3));
    }

    @Test
    public void zero() {
        assertEquals(0, lcm(0, 2));
    }

    @Test
    public void multipleOfTheOther() {
        assertEquals(12, lcm(3, 12));
    }

    @Test
    public void negativeEqualsNegative() {
        assertEquals(-12, lcm(-3, 12));
    }

    @Test
    public void negativeEqualsPositive() {
        assertEquals(12, lcm(-3, -12));
    }
}
