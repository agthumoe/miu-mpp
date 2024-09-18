

import java.util.Comparator;

public class TitleComparator implements Comparator<Product> {
    @Override
    public int compare(Product lhs, Product rhs) {
        return lhs.getTitle().compareTo(rhs.getTitle());
    }
}
