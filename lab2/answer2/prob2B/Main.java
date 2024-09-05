package prob2B;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1,new Date());
        order.getOrderLine().addOrderlinenum(1,15,1);
        order.getOrderLine().addOrderlinenum(2,20,2);

        System.out.println("Order num: " + order.getOrderNum() + ", date: " + order.getOrderDate());
        System.out.println("Order Line: " + order.getOrderLine().getOrderLineItems());
    }
}
