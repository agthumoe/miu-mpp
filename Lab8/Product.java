import java.util.Arrays;
import java.util.Comparator;

public class Product {
    final String title;
    final double price;
    final int model;

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getModel() {
        return model;
    }

    public Product(String title, Double price, int model) {
        this.title = title;
        this.price = price;
        this.model = model;
    }

    @Override
    public String toString() {
        return String.format("\n %s : %s : %s", title, price, model);
    }

    public static void main(String[] args) {
        PriceComparator priceComparator = new PriceComparator();
        Product[] productList1 = { new Product("C", 100.0d, 9), new Product("B", 20.0d, 8), new Product("A", 120d, 1) };
        Product[] productList2 = new Product[productList1.length];
        Product[] productList3 = new Product[productList2.length];
        Product[] productList4 = new Product[productList3.length];

        System.arraycopy(productList1, 0, productList2, 0, productList1.length);
        System.arraycopy(productList1, 0, productList3, 0, productList1.length);
        System.arraycopy(productList1, 0, productList4, 0, productList1.length);

        Arrays.sort(productList1, priceComparator);
        System.out.println(Arrays.toString(productList1));
        Arrays.sort(productList2, (lhs, rhs) -> {
            if (lhs.getPrice() < rhs.getPrice()) {
                return -1;
            } else if (lhs.getPrice() > rhs.getPrice()) {
                return 1;
            }
            return 0;
        });
        System.out.println(Arrays.toString(productList2));

        Arrays.sort(productList3, new TitleComparator());
        System.out.println(Arrays.toString(productList3));
        Arrays.sort(productList4, (lhs, rhs) -> lhs.getTitle().compareTo(rhs.getTitle()));
        System.out.println(Arrays.toString(productList4));
    }
}
