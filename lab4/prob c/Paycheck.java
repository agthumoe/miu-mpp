import java.time.LocalDate;
//immutable class
public final class Paycheck {
    private double grossPay;
    private double fica;
    private double state;
    private double local;
    private double medicare;
    private double socialSecurity;
    private double netPay;
    String empID;

    public Paycheck(String empID, double grossPay, double fica, double state, double local, double medicare, double socialSecurity, double netPay) {
        this.grossPay = grossPay;
        this.fica = fica;
        this.state = state;
        this.local = local;
        this.medicare = medicare;
        this.socialSecurity = socialSecurity;
        this.netPay = netPay;
        this.empID = empID;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public double getFica() {
        return fica;
    }

    public double getState() {
        return state;
    }

    public double getLocal() {
        return local;
    }

    public double getMedicare() {
        return medicare;
    }

    public double getSocialSecurity() {
        return socialSecurity;
    }

    public double getNetPay() {
        return netPay;
    }


    public String print() {
        return "Employee ID= "+ empID+
                "Paycheck{" +
                "grossPay=" + grossPay +
                ", fica=" + fica +
                ", state=" + state +
                ", local=" + local +
                ", medicare=" + medicare +
                ", socialSecurity=" + socialSecurity +
                ", netPay=" + netPay +
                '}';
    }


}
