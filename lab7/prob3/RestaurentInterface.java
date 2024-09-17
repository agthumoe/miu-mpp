public interface RestaurentInterface {

    static void printFormattedData(String restaurantName, String customerName, double orderAmount,
            double deliveryCharge, double discount, double totalAfterDiscount) {
        System.out.println("Restaurant: " + restaurantName);
        System.out.println("Customer: " + customerName);
        System.out.printf("Order Amount: $%.2f\n", orderAmount);
        System.out.printf("Delivery Charge: $%.2f\n", deliveryCharge);
        System.out.printf("Discount Applied: $%.2f\n", discount);
        System.out.printf("Total after Discount: $%.2f\n\n", totalAfterDiscount);
    }

    String getRestaurantName();

    double calculateDeliveryCharge(double distance);

    default double calculateDiscount(double totalOrderAmount) {
        if (totalOrderAmount > 100) {
            return totalOrderAmount * 0.05;
        }
        return 0;
    }
}
