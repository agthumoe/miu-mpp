package lesson3.labs.prob3;

public class Trailer extends Property {
	private static final double RENT = 500;

	public Trailer(Address address) {
		super(address);
	}

	@Override
	public double computeRent(){
		return RENT;
	}

	@Override
	public String toString() {
		return "property: trailer, address: " + this.getAddress() + "\n";
	}
}
