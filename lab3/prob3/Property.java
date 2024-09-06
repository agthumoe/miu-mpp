package lesson3.labs.prob3;

public abstract class Property {
    private Address address;
    public Address getAddress() {
        return address;
    }

    public Property(Address address) {
        this.address = address;
    }

    public abstract double computeRent();
}
