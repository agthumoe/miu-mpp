public final class Paycheck {
    private final double grossPay;
    private final double fica;
    private final double state;
    private final double local;
    private final double medicare;
    private final double socialSecurity;


    public Paycheck(double grossPay) {
        this.grossPay = grossPay;
        this.fica = 0.23;
        this.state = 0.05;
        this.local = 0.01;
        this.medicare = 0.03;
        this.socialSecurity = 0.075;
    }

    public void print() {
        System.out.println("Paystub:\n" +
                "Gross Pay: " + this.grossPay + "\n" +
                "Fica: " + this.fica + "\n" +
                "State: " + this.state + "\n" +
                "Local: " + this.local + "\n" +
                "Medicare: " + this.medicare + "\n" +
                "Social Security: " + this.socialSecurity + "\n" +
                "NET PAY: " + this.getNetPay() + "\n");
    }

    public double getNetPay() {
        double netPay = this.grossPay;
        netPay -= this.fica * this.grossPay;
        netPay -= this.state * this.grossPay;
        netPay -= this.local * this.grossPay;
        netPay -= this.medicare * this.grossPay;
        netPay -= this.socialSecurity * this.grossPay;
        return netPay;
    }
}
