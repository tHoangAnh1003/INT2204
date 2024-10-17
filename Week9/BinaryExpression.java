public abstract class BinaryExpression extends Expression {
    protected Expression left;
    protected Expression right;

    /**
     * Binary Constructor.
     * @param left Expression.
     * @param right Expression.
     */
    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public abstract double evaluate();

    public abstract String toString();
}
