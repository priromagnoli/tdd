package math;

public class Fraction {
    private final int denominator;
    private final int numerator;
    private final int integerValue;

    public Fraction(int integerValue) {
        this.integerValue = integerValue;
        this.numerator = integerValue;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.integerValue = numerator;
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction plus(Fraction that) {
        return new Fraction(this.integerValue + that.integerValue, that.denominator);
    }

    public int intValue() {
        return this.integerValue;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
}
