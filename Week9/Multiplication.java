public class Multiplication extends BinaryExpression {
    public Multiplication(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double evaluate() {
        return left.evaluate() * right.evaluate();
    }

    /**
     * Format String.
     * @return String.
     */
    @Override
    public String toString() {
        return String.format("(%s * %s)", left.toString(), right.toString());
    }
}
