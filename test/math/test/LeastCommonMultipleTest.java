package math.test;

import org.junit.Test;

import static math.NumberTheory.lcm;
import static org.junit.Assert.assertEquals;

public class LeastCommonMultipleTest {
    @Test
    public void resultOfMultiplication() {
        assertEquals(6, lcm(3, 2));
    }


}
