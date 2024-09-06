import java.util.ArrayList;
import java.util.List;

public class Building {

    private List<Apartment> apartments;
    private double maintenanceCost;

    public Building(double maintenanceCost){
        this.maintenanceCost = maintenanceCost;
        this.apartments = new ArrayList<Apartment>();

    }

    public void addApartment(Apartment apartment){
        apartments.add(apartment);
    }

    public double generateApartmentProfit(){
        double profit = 0;
        for(Apartment apartment : apartments){
            profit +=apartment.getRent();
        }
        return profit - maintenanceCost;
    }

}
