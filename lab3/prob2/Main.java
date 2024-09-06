//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LandLord landlord = new LandLord();

        // Create some buildings
        Building building1 = new Building(1000); // Maintenance cost is 1000
        Building building2 = new Building(800);  // Maintenance cost is 800

        // Add apartments to building 1
        building1.addApartment(new Apartment(1500)); // Rent 1500
        building1.addApartment(new Apartment(2000)); // Rent 2000

        // Add apartments to building 2
        building2.addApartment(new Apartment(1200)); // Rent 1200
        building2.addApartment(new Apartment(1500)); // Rent 1500
        building2.addApartment(new Apartment(1800)); // Rent 1800

        // Add buildings to the landlord
        landlord.addBuilding(building1);
        landlord.addBuilding(building2);

        // Calculate and print the landlord's total profit
        double totalProfit = landlord.calculateMonthlyProfit();
        System.out.println("Landlord's Total Monthly Profit: $" + totalProfit);

    }
}