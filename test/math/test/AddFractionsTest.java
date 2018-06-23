package math.test;

import math.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddFractionsTest {
    @Test
    public void zeroPlusZero() {
        Fraction sum = new Fraction(0).plus(new Fraction(0));

        assertEquals(0, sum.intValue());
    }

    @Test
    public void notZeroPlusZero() {
        Fraction sum = new Fraction(3).plus(new Fraction(0));

        assertEquals(3, sum.intValue());
    }

    @Test
    public void zeroPlusNotZero() {
        Fraction sum = new Fraction(0).plus(new Fraction(5));

        assertEquals(5, sum.intValue());
    }

    @Test
    public void nonNegativeNonZeroOperands() {
        Fraction sum = new Fraction(3).plus(new Fraction(4));

        assertEquals(7, sum.intValue());
    }

    @Test
    public void negativeInputsAndNegativeOutputs() {
        Fraction sum = new Fraction(-3).plus(new Fraction(1));

        assertEquals(-2, sum.intValue());
    }

    @Test
    public void nonTrivialButCommonDenominator() {
        Fraction sum = new Fraction(1, 5).plus(new Fraction(2, 5));

        assertEquals(3, sum.getNumerator());
        assertEquals(5, sum.getDenominator());
    }
}
