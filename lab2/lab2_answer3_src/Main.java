public class Main {
    public static void main(String[] args) {
        Car carWithGps = new Car("Toyota", "Camry");
        carWithGps.createGps("Garmin", "X1234ABC");

        System.out.println(carWithGps);

        Car carWithoutGps = new Car("Honda", "Civic");
        System.out.println(carWithoutGps);
    }
}