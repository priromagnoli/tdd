package math.test;

import math.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionEqualsTest {

    @Test
    public void sameNumeratorAndDenominator() {
        assertEquals(new Fraction(3, 5), new Fraction(3, 5));
    }
}
