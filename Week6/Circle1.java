class Circle1 {
    protected static final double PI = 3.14;
    private double radius;
    private String color;

    public Circle1() {
        this.radius = 0;
        this.color = "White";
    }

    /**
     * Constructor radius.
     */
    public Circle1(double radius) {
        this.radius = radius;
    }

    /**
     * Constructor radius and color.
     */
    public Circle1(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Compute Area Value.
     */
    public double getArea() {
        return radius * radius * PI;
    }

    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
} 