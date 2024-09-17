import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product lhs, Product rhs) {
        if (lhs.getPrice() < rhs.getPrice()) {
            return -1;
        } else if (lhs.getPrice() > rhs.getPrice()) {
            return 1;
        }
        return 0;
    }
}
