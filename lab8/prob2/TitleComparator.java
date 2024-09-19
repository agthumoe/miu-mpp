import java.util.Comparator;

/**
 * This is for Problem 2 b. of Lab 8
 */
public class TitleComparator implements Comparator<Product> {
    @Override
    public int compare(Product lhs, Product rhs) {
        return lhs.getTitle().compareTo(rhs.getTitle());
    }
}
