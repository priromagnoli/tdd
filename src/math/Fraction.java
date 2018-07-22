package math;

import static math.NumberTheory.lcm;

public class Fraction {
    private final int denominator;
    private final int numerator;

    public Fraction(int integerValue) {
        this(integerValue, 1);
    }

    public Fraction(int numerator, int denominator) {
        int signOfDenominator = denominator < 0 ? -1 : 1;
        int gcd = NumberTheory.gcd(numerator, denominator) * signOfDenominator;

        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    public Fraction plus(Fraction that) {
        return new Fraction(this.numerator * that.denominator + this.denominator * that.numerator,
                this.denominator * that.denominator);
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Fraction) {
            Fraction that = (Fraction) other;
            return this.numerator == that.numerator
                    && this.denominator == that.denominator;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return numerator * 19 + denominator;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }

    public Fraction times(Fraction that) {
        return new Fraction(this.numerator * that.numerator, this.denominator * that.denominator);
    }

    public Fraction minus(Fraction that) {
        if (this.denominator == that.denominator) {
            return new Fraction(this.numerator - that.numerator, denominator);
        } else {
            int lcm = lcm(this.denominator, that.denominator);
            int numerator = (lcm / this.denominator * this.numerator) - (lcm / that.denominator * that.numerator);
            return new Fraction(numerator, lcm);
        }
    }
}
