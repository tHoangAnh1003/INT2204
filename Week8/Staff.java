public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * Constructor.
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String toString() {
        return String.format("Staff[%s,school=%s,pay=%.1f]",
                super.toString(), school, pay);
    }

}
