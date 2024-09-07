import java.time.LocalDate;

class Order {
    private String orderId;
    private LocalDate date;
    private double orderAmount;

    public Order(String orderId, LocalDate date, double orderAmount) {
        this.orderId = orderId;
        this.date = date;
        this.orderAmount = orderAmount;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getOrderAmount() {
        return orderAmount;
    }
}