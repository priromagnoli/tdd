package math.test;

import math.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReduceFractionTest {
    @Test
    public void alreadyInLowestTerms() {
        assertEquals(new Fraction(3, 4), new Fraction(3, 4));
    }

    @Test
    public void reduceNotToWholeNumber() {
        assertEquals(new Fraction(3, 4), new Fraction(6, 8));
    }
}
