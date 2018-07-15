package math.test;

import math.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyFractionsTest {
    @Test
    public void zeroTimesZero() {
        assertEquals(new Fraction(0), new Fraction(0).times(new Fraction(0)));
    }

    @Test
    public void notZeroTimesZero() {
        assertEquals(new Fraction(0), new Fraction(3).times(new Fraction(0)));
    }

    @Test
    public void zeroTimesNotZero() {
        assertEquals(new Fraction(0), new Fraction(0).times(new Fraction(5)));
    }

    @Test
    public void notZeroTimesNotZero() {
        assertEquals(new Fraction(12), new Fraction(3).times(new Fraction(4)));
    }

    @Test
    public void negativeTimesNonNegative() {
        assertEquals(new Fraction(-6), new Fraction(-3).times(new Fraction(2)));
    }

    @Test
    public void negativeTimesNegative() {
        assertEquals(new Fraction(6), new Fraction(-3).times(new Fraction(-2)));
    }

    @Test
    public void oneAsDenominator() {
        Fraction actualFraction = new Fraction(2, 1).times(new Fraction(3, 1));
        assertEquals(new Fraction(6), actualFraction);
    }

    @Test
    public void allDenominatorsDifferentFromOne() {
        Fraction actualFraction = new Fraction(3, 2).times(new Fraction(7, 3));
        assertEquals(new Fraction(21, 6), actualFraction);
    }
}
