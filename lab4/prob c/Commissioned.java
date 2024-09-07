import java.util.List;

class Commissioned extends Employee {
    private double baseSalary;
    private double commission;
    private List<Order> orders;

    public Commissioned(String empId, double commissionRate, double baseSalary, List<Order> orders) {
        super(empId);
        this.commission = commissionRate;
        this.baseSalary = baseSalary;
        this.orders = orders;
    }

    @Override
    public double calcGrossPay(int month, int year) {
        double previousMonthOrderAmounts = 0;
        for (Order order : this.orders) {
            if (month == 1) {
                if (order.getDate().getMonthValue() == 12 && order.getDate().getYear() == year - 1) {
                    previousMonthOrderAmounts += order.getOrderAmount();
                }
            } else {
                if (order.getDate().getMonthValue() == month - 1 && order.getDate().getYear() == year) {
                    previousMonthOrderAmounts += order.getOrderAmount();
                }
            }
        }
        return this.baseSalary + (this.commission * previousMonthOrderAmounts);
    }

//    @Override
//    public double calcGrossPay(int month, int year) {
//        double totalSales = 0;
//        for (Order order : orders) {
//            if (order.getDate().getMonthValue() == month && order.getDate().getYear() == year) {
//                totalSales += order.getOrderAmount();
//            }
//        }
//        return baseSalary + (commissionRate * totalSales);
//    }
}