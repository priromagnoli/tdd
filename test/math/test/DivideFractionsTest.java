package math.test;

import math.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivideFractionsTest {
    @Test
    public void numberDividedByItself() {
        assertEquals(new Fraction(1), new Fraction(3).dividedBy(new Fraction(3)));
    }
}
