

import java.util.Comparator;

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
