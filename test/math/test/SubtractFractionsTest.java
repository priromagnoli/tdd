package math.test;

import math.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractFractionsTest {
    @Test
    public void zeroMinusZero() {
        assertEquals(new Fraction(0), new Fraction(0).minus(new Fraction(0)));
    }
}
