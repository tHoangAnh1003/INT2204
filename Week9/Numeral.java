public class Numeral extends Expression {
    private double value;

    public Numeral() {}

    public Numeral(double value) {
        this.value = value;
    }

    @Override
    public double evaluate() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("%.0f", value);
    }
}
