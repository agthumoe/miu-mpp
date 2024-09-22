package lab9.prob9;

import java.util.Optional;

import static lab9.prob9.Dish.menu;

public class Test {
    public static void main(String[] args) {
        // Query a
        System.out.println("Query 9.a");
        boolean isThereAnyVegetarianMeal = menu.stream()
                .filter(Dish::isVegetarian)
                .findAny()
                .isPresent();
        System.out.println("Any vegetarian meal: " + (isThereAnyVegetarianMeal ? "Yes" : "No"));
        System.out.println(" ==== end of Query 9.a ====");

        // Query b
        System.out.println("Query 9.b");
        boolean isThereMenuLessThan1000Calories = menu.stream()
                .anyMatch(d -> d.getCalories() < 1000);
        System.out.println("Healthy menu: " + (isThereMenuLessThan1000Calories ? "Yes" : "No"));
        System.out.println(" ==== end of Query 9.b ====");

        // Query c
        System.out.println("Query 9.c");
        boolean isThereMenuGreaterThan1000Calories = menu.stream()
                .anyMatch(d -> d.getCalories() > 1000);
        System.out.println("Unhealthy menu: " + (isThereMenuGreaterThan1000Calories ? "Yes" : "No"));
        System.out.println(" ==== end of Query 9.c ====");

        // Query d
        System.out.println("Query 9.d");
        Optional<Dish> optional = menu.stream()
                .filter(d -> d.getType() == Dish.Type.MEAT)
                .findFirst();
        System.out.println("Meat Dish: " + (optional.isPresent() ? optional.get().getName() : "No"));
        System.out.println(" ==== end of Query 9.d ====");

        // Query e
        System.out.println("Query 9.e");
        int sum = menu.stream()
                .mapToInt(Dish::getCalories)
                .reduce(0, (x, y) -> x + y);
        System.out.println("Total calories: " + sum);
        System.out.println(" ==== end of Query 9.e");

        // Query f
        // I used 2 ways to solve this.
        System.out.println("Query 9.f");
        int total = menu.stream()
                .mapToInt(Dish::getCalories)
                .reduce(0, Integer::sum);
        int sumMethod = menu.stream()
                .mapToInt(Dish::getCalories)
                .sum();
        System.out.println("Total calories: " + total);
        System.out.println(" ==== end of Query 9.f ====");
    }
}
