import java.util.ArrayList;
import java.util.List;

public class LandLord {

    private List<Building> buildings;

    public LandLord() {
        buildings = new ArrayList<Building>();
    }

    public void addBuilding(Building building) {

        buildings.add(building);
    }

    public double calculateMonthlyProfit() {
        double totalProfit = 0;
        for (Building building : buildings) {
            totalProfit += building.generateApartmentProfit();
        }
        return totalProfit;
    }

}

