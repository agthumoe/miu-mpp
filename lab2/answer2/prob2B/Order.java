package prob2B;

import java.util.Date;

public class Order {
    private int orderNum;
    private Date orderDate;
    private OrderLine orderLine;

    public Order(int orderNum, Date orderDate) {
        this.orderNum = orderNum;
        this.orderDate = orderDate;
        orderLine = new OrderLine(this);
    }

    public int getOrderNum() {
        return orderNum;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public OrderLine getOrderLine() {
        return orderLine;
    }
}
