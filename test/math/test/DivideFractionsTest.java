package math.test;

import math.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivideFractionsTest {
    @Test
    public void numberDividedByItself() {
        assertEquals(new Fraction(1), new Fraction(3).dividedBy(new Fraction(3)));
    }

    @Test
    public void zeroDividedByNotZero() {
        assertEquals(new Fraction(0), new Fraction(0).dividedBy(new Fraction(3)));
    }

    @Test
    public void notZeroDividedByNotZero() {
        assertEquals(new Fraction(2), new Fraction(4).dividedBy(new Fraction(2)));
    }

    @Test
    public void negativeNumerator() {
        assertEquals(new Fraction(2), new Fraction(-4).dividedBy(new Fraction(-2)));
    }

    @Test (expected = ArithmeticException.class)
    public void notZeroDividedByZero() {
        new Fraction(2).dividedBy(new Fraction(0));
    }

    @Test (expected = ArithmeticException.class)
    public void zeroDividedByZero() {
        new Fraction(0).dividedBy(new Fraction(0));
    }

    @Test
    public void nonFractionResultsInFraction() {
        Fraction actualFraction = new Fraction(2).dividedBy(new Fraction(4));
        assertEquals(new Fraction(1, 2), actualFraction);
    }

    @Test
    public void firstDenominatorAndSecondNumeratorEqualOne() {
        Fraction actualFraction = new Fraction(3, 1).dividedBy(new Fraction(1, 2));
        assertEquals(new Fraction(6), actualFraction);
    }

    @Test
    public void allNumeratorsAndDenominatorsDifferentFromOne() {
        Fraction actualFraction = new Fraction(10, 5).dividedBy(new Fraction(2, 8));
        assertEquals(new Fraction(8), actualFraction);
    }

    @Test
    public void oneNegativeDenominator() {
        Fraction actualFraction = new Fraction(10, -5).dividedBy(new Fraction(2, 8));
        assertEquals(new Fraction(-8), actualFraction);
    }

    @Test
    public void simplifyResults() {
        Fraction actualFraction = new Fraction(3, 3).dividedBy(new Fraction(9, 6));
        assertEquals(new Fraction(2, 3), actualFraction);
    }
}
