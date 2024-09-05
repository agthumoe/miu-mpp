public class Car {
    private String make;
    private String model;
    private GPS gps; // GPS is optional

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        this.gps = null; // No GPS installed
    }

    public void createGps(String model, String serialNumber) {
        if (this.gps == null) {
            this.gps = new GPS(model, serialNumber);
        }
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public GPS getGps() {
        return gps;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", gps=" + (gps != null ? gps.toString() : "No GPS installed") +
                '}';
    }
}
