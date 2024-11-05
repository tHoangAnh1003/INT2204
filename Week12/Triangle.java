public class Triangle implements GeometricObject {

    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * Ham khoi tao co kiem tra ngoai le.
     */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        if (trungDiem(p1, p2) || trungDiem(p2, p3) || trungDiem(p3, p1)
            || thangHang(p1, p2, p3)) {
            throw new RuntimeException();
        }
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Point getP1() {
        return p1;
    }

    /**
     * Kiem tra trung p1.
     */
    public void setP1(Point p1) {
        if (!trungDiem(p1, this.p2) && !trungDiem(p1, this.p3)
            && thangHang(p1, this.p2, this.p3)) {
            this.p1 = p1;
        }
    }

    public Point getP2() {
        return p2;
    }

    /**
     * Kiem tra trung p2.
     */
    public void setP2(Point p2) {
        if (!trungDiem(p2, this.p1) && !trungDiem(p2, this.p3)
                && thangHang(p2, this.p1, this.p3)) {
            this.p2 = p2;
        }
    }

    public Point getP3() {
        return p3;
    }

    /**
     * Kiem tra trung p3.
     */
    public void setP3(Point p3) {
        if (!trungDiem(p3, this.p2) && !trungDiem(p3, this.p1)
                && thangHang(p3, this.p2, this.p1)) {
            this.p3 = p3;
        }
    }

    /**
     * Tinh dien tich.
     */
    @Override
    public double getArea() {
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p1.distance(p3);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    /**
     * Tinh chu vi.
     */
    @Override
    public double getPerimeter() {
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p1.distance(p3);
        return a + b + c;
    }

    /**
     * In ra.
     */
    @Override
    public String getInfo() {
        return String.format(
                "Triangle[%s,%s,%s]",
                p1.toString(),
                p2.toString(),
                p3.toString()
        );
    }

    /**
     * Kiem tra trung diem.
     */
    private boolean trungDiem(Point a, Point b) {
        return a.getPointX() == b.getPointY() && a.getPointY() == b.getPointY();
    }

    /**
     * Kiem tra thang hang.
     */
    private boolean thangHang(Point a, Point b, Point c) {
        return (a.getPointY() - b.getPointY()) / (a.getPointX() - b.getPointX())
                == (b.getPointY() - c.getPointY()) / (b.getPointX() - c.getPointX());
    }
}
