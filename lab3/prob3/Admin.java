package lesson3.labs.prob3;

import java.util.ArrayList;
import java.util.List;

public class Admin {
	public static double computeTotalRent(Property[] properties) {
		double totalRent = 0;
		for (Property property : properties) {
			totalRent += property.computeRent();
		}
		return totalRent;
	}

	public static List<Property> filter(Property[] properties, String city) {
		List<Property> propertyList = new ArrayList<>();
		for(Property property: properties) {
			if (property.getAddress().getCity().equals(city)) {
				propertyList.add(property);
			}
		}
		return propertyList;
	}
}
