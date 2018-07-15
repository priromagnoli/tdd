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
}
