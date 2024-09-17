import java.util.ArrayList;
import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FoodDeliverySystem {
    public static void main(String[] args) {
        // Create an ArrayList of Restaurants
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("Sushi Palace", 5.0, 10.0));
        restaurants.add(new Restaurant("Pizza Corner", 3.5, 5.0));
        restaurants.add(new Restaurant("Burger World", 4.0, 7.5));

        // Create an ArrayList of Customers
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("John Doe", 60));
        customers.add(new Customer("Jane Smith", 40));
        customers.add(new Customer("Bob Johnson", 80));

        // Print welcome message
        System.out.println("Welcome to the Food Delivery System!");

        // Outer forEach: Processing restaurants
        restaurants.forEach(restaurant -> {
            // Inner forEach: Processing customers for each restaurant
            customers.forEach(customer -> {
                System.out.println("Processing order for Customer: " + customer.getCustomerName() +
                        " at Restaurant: " + restaurant.getRestaurantName());

                // Check if customer is a loyal customer
                boolean isLoyal = customer.isLoyaltyCustomer(customer.getLoyaltyPoints());
                System.out.println("Customer Loyalty Status: " + (isLoyal ? "Loyal Customer" : "New Customer"));
                // Generate a random order amount between $50 and $200
                Random random = new Random();
                double orderAmount = 50 + (200 - 50) * random.nextDouble();
                double deliveryCharge = restaurant.calculateDeliveryCharge(restaurant.getLocalDistance());
                double discount = restaurant.calculateDiscount(orderAmount);
                double totalAfterDiscount = orderAmount - discount + deliveryCharge;
                // Print formatted order details using the static method
                RestaurentInterface.printFormattedData(
                        restaurant.getRestaurantName(),
                        customer.getCustomerName(),
                        orderAmount,
                        deliveryCharge,
                        discount,
                        totalAfterDiscount
                );
            });
        });



            }
}