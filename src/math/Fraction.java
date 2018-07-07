package math;

public class Fraction {
    private final int denominator;
    private final int numerator;

    public Fraction(int integerValue) {
        this(integerValue, 1);
    }

    public Fraction(int numerator, int denominator) {
        int gcd = NumberTheory.gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    public Fraction plus(Fraction that) {
        if (this.denominator != that.denominator) {
            return new Fraction(this.numerator * that.denominator + this.denominator * that.numerator,
                    this.denominator * that.denominator);
        } else {
            return new Fraction(this.numerator + that.numerator, denominator);
        }
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
}
