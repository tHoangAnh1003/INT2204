package KeThua1;

class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        this.height = 0;
    }

    /**
     * Constructor height.
     */
    public Cylinder(double height) {
        this.height = height;
    }

    /**
     * Constructor height and radius.
     */
    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    /**
     * Constructor height, radius and color.
     */
    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    /**
     * Compute Volume value.
     */
    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ",height=" + height + "]";
    }
} 