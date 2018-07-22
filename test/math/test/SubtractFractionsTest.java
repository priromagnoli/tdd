package math.test;

import math.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractFractionsTest {
    @Test
    public void zeroMinusZero() {
        assertEquals(new Fraction(0), new Fraction(0).minus(new Fraction(0)));
    }

    @Test
    public void notZeroMinusZero() {
        assertEquals(new Fraction(3), new Fraction(3).minus(new Fraction(0)));
    }

    @Test
    public void zeroMinusNotZero() {
        assertEquals(new Fraction(-3), new Fraction(0).minus(new Fraction(3)));
    }

    @Test
    public void oneAsDenominator() {
        Fraction actualFraction = new Fraction(3, 1).minus(new Fraction(2, 1));
        assertEquals(new Fraction(1), actualFraction);
    }

    @Test
    public void equalDenominatorsDifferentFromOne() {
        Fraction actualFraction = new Fraction(2, 3).minus(new Fraction(1, 3));
        assertEquals(new Fraction(1, 3), actualFraction);
    }
}
