public class Square extends Expression {
    private Expression expression;

    public Square(Expression expression) {
        this.expression = expression;
    }

    @Override
    public double evaluate() {
        return Math.pow(expression.evaluate(), 2);
    }

    /**
     * Format String.
     * @return String.
     */
    @Override
    public String toString() {
        return String.format("(%s) ^ 2", expression.toString());
    }
}
