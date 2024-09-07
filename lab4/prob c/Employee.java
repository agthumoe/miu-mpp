
import java.time.LocalDate;
import java.util.List;

abstract class Employee {
    private String empId;

    public Employee(String empId) {
        this.empId = empId;
    }

    public abstract double calcGrossPay(int month, int year);

    public Paycheck calCompensation(int month, int year) {
        double grossPay = calcGrossPay(month, year);
        double fica =  0.23;
        double state =  0.05;
        double local =  0.01;
        double medicare =  0.03;
        double socialSecurity = 0.075;
        double netPay = getNetPay(grossPay);

        return new Paycheck(empId,grossPay, fica, state, local, medicare, socialSecurity, netPay);
    }

    private double getNetPay(double grossPay){
        double totalDeductions =(grossPay * 0.23)+ (grossPay * 0.05)+ (grossPay * 0.01)+ (grossPay * 0.03)+ (grossPay * 0.075);
        return grossPay - totalDeductions;
    }

    public void print(int month, int year) {
        System.out.println(calCompensation(month, year).print());
    }


}