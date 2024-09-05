public class GPS {
    private String model;
    private String serialNumber;

    public GPS(String model, String serialNumber) {
        this.model = model;
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "GPS{" +
                "model='" + model + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}