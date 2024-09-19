import java.util.Comparator;

/**
 * This is for Problem 2 c. of Lab 8
 */
public class ProductComparator implements Comparator<Product> {
    private SortMethod method;

    public ProductComparator(SortMethod method) {
        this.method = method;
    }

    @Override
    public int compare(Product lhs, Product rhs) {
        if (SortMethod.BY_PRICE == this.method) {
            if (lhs.getPrice() < rhs.getPrice()) {
                return -1;
            } else if (lhs.getPrice() > rhs.getPrice()) {
                return 1;
            }
            return 0;
        } else {
            return lhs.getTitle().compareTo(rhs.getTitle());
        }
    }
}
