public class Restaurant implements RestaurentInterface {

  private String restaurantName;
  private double baseDeveliverCharge;
  private double localDistance;

  public Restaurant(String restaurantName, double baseDeveliverCharge, double localDistance) {
    this.restaurantName = restaurantName;
    this.baseDeveliverCharge = baseDeveliverCharge;
    this.localDistance = localDistance;
  }

  public double getLocalDistance() {
    return localDistance;
  }

  @Override
  public String getRestaurantName() {
    return this.restaurantName;
  }

  @Override
  public double calculateDeliveryCharge(double localDistance) {
    return this.baseDeveliverCharge + (localDistance * 0.05);
  }

}
