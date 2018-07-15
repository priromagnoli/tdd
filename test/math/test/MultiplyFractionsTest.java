package math.test;

import math.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyFractionsTest {
    @Test
    public void zeroTimesZero() {
        assertEquals(new Fraction(0), new Fraction(0).times(new Fraction(0)));
    }
}
