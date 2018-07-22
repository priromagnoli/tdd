package math.test;

import org.junit.Test;

import static math.NumberTheory.gcd;
import static org.junit.Assert.assertEquals;

public class LeastCommonMultipleTest {
    @Test
    public void name() {
        assertEquals(6, lcm(3, 2));
    }

    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return (a * b) / gcd(a, b);
    }

}
