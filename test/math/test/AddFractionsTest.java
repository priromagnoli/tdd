package math.test;

import math.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddFractionsTest {
    @Test
    public void zeroPlusZero() {
        Fraction sum = new Fraction(0).plus(new Fraction(0));
        assertEquals(new Fraction(0), sum);
    }

    @Test
    public void notZeroPlusZero() {
        Fraction sum = new Fraction(3).plus(new Fraction(0));
        assertEquals(new Fraction(3), sum);
    }

    @Test
    public void zeroPlusNotZero() {
        Fraction sum = new Fraction(0).plus(new Fraction(5));
        assertEquals(new Fraction(5), sum);
    }

    @Test
    public void nonNegativeNonZeroOperands() {
        Fraction sum = new Fraction(3).plus(new Fraction(4));
        assertEquals(new Fraction(7), sum);
    }

    @Test
    public void negativeInputsAndNegativeOutputs() {
        Fraction sum = new Fraction(-3).plus(new Fraction(1));
        assertEquals(new Fraction(-2), sum);
    }

    @Test
    public void nonTrivialButCommonDenominator() {
        Fraction sum = new Fraction(1, 5).plus(new Fraction(2, 5));
        assertEquals(new Fraction(3, 5), sum);
    }

    @Test
    public void differentDenominatorsWithoutReducing() {
        assertEquals(new Fraction(5, 6), new Fraction(1, 2).plus(new Fraction(1, 3)));
    }

    @Test
    public void reduceResultToWholeNumber() {
        assertEquals(new Fraction(1), new Fraction(1, 3).plus(new Fraction(2, 3)));
    }

    @Test
    public void oneDenominatorIsTheMultipleOfTheOther() {
        assertEquals(new Fraction(11, 8), new Fraction(3, 4).plus(new Fraction(5, 8)));
    }

    @Test
    public void commonFactorInDenominators() {
        assertEquals(new Fraction(11, 18), new Fraction(1, 6).plus(new Fraction(4, 9)));
    }

    @Test
    public void reduceResultEvenWhenDenominatorsAreTheSame() {
        assertEquals(new Fraction(3, 2), new Fraction(3, 4).plus(new Fraction(3, 4)));
    }

    @Test
    public void negativeFractionAndReducing() {
        assertEquals(new Fraction(1, 2), new Fraction(-1, 4).plus(new Fraction(3, 4)));
        assertEquals(new Fraction(-1, 8), new Fraction(3, 8).plus(new Fraction(-1, 2)));
    }

    @Test
    public void negativeSignsEverywhere() {
        assertEquals(new Fraction(1, 2), new Fraction(1, -4).plus(new Fraction(-3, -4)));
    }
}
