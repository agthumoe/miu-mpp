package prob2B;

public class OrderLineItem {
    private OrderLine orderLine;
    private int orderlinenum;
    private int price;
    private int quantity;

    public OrderLineItem(OrderLine orderLine, int orderlinenum, int price, int quantity) {
        this.orderLine = orderLine;
        this.orderlinenum = orderlinenum;
        this.price = price;
        this.quantity = quantity;
    }

    public OrderLine getOrderLine() {
        return orderLine;
    }

    public int getOrderlinenum() {
        return orderlinenum;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "OrderLineItem{" +
                "orderlinenum=" + orderlinenum +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
