public class Customer implements CustomerInterface{

private String customerName;
private int loyaltyPoints;;

    @Override
    public String getCustomerName() {
        return this.customerName;
    }

    public Customer(String customerName, int loyaltyPoints) {
        this.customerName = customerName;
        this.loyaltyPoints = loyaltyPoints;
    }

    @Override
    public int getLoyaltyPoints() {
        return this.loyaltyPoints;
    }
}
