public class Circle implements  GeometricObject {
    private static final double PI = 3.14;
    private Point center;
    private double radius;

    /**
     * Ham khoi tao.
     */
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Tinh dien tich.
     */
    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * Tinh chu vi.
     */
    @Override
    public double getPerimeter() {
        return PI * 2 * radius;
    }

    /**
     * In ra point.
     */
    @Override
    public String getInfo() {
        return String.format("Circle[%s,r=%.2f]",
                this.center.toString(), this.radius);
    }
}
