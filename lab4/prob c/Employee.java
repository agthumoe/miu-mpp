abstract class Employee {
    private String empId;

    public Employee(String empId) {
        this.empId = empId;
    }

    public abstract double calcGrossPay(int month, int year);

    public Paycheck calcCompensation(int month, int year) {
        double grossPay = calcGrossPay(month, year);
        return new Paycheck(grossPay);
    }

    private double getNetPay(double grossPay){
        double totalDeductions =(grossPay * 0.23)+ (grossPay * 0.05)+ (grossPay * 0.01)+ (grossPay * 0.03)+ (grossPay * 0.075);
        return grossPay - totalDeductions;
    }

    public void print(int month, int year) {
        System.out.println("Employee Id: " + this.empId);
        this.calcCompensation(month, year).print();
    }
}