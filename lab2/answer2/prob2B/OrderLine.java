package prob2B;

import java.util.ArrayList;
import java.util.List;

public class OrderLine {
    private Order order;
    private List<OrderLineItem> orderLineItems;

    OrderLine(Order order) {
        this.order = order;
        orderLineItems = new ArrayList<OrderLineItem>();
    }

    public void addOrderlinenum(int orderlinenum, int price, int quantity) {
        OrderLineItem orderLineItem = new OrderLineItem(this, orderlinenum, price, quantity);
        orderLineItems.add(orderLineItem);
    }

    public Order getOrder() {
        return order;
    }

    public List<OrderLineItem> getOrderLineItems() {
        return orderLineItems;
    }
}
