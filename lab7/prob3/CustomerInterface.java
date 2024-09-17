public interface CustomerInterface {

    String getCustomerName();

    int getLoyaltyPoints();

    default boolean isLoyaltyCustomer(int loyaltyPoints) {

        return loyaltyPoints > 50 ? true : false;
    }
}
