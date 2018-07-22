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
}
