package math;

public class Fraction {
    private final int denominator;
    private final int numerator;

    public Fraction(int integerValue) {
        this(integerValue, 1);
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction plus(Fraction that) {
        return new Fraction(this.numerator + that.numerator, that.denominator);
    }

    public int intValue() {
        return this.numerator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
}
