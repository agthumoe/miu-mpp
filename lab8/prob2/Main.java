import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Product[] productList1 = { new Product("C", 100.0d, 9), new Product("B", 20.0d, 8), new Product("A", 120d, 1) };
    Product[] productList2 = new Product[productList1.length];
    Product[] productList3 = new Product[productList2.length];
    Product[] productList4 = new Product[productList3.length];

    System.arraycopy(productList1, 0, productList2, 0, productList1.length);
    System.arraycopy(productList1, 0, productList3, 0, productList1.length);
    System.arraycopy(productList1, 0, productList4, 0, productList1.length);

    // Problem 2 (a) using PriceComparator outside the class.
    PriceComparator priceComparator = new PriceComparator();
    Arrays.sort(productList1, priceComparator);
    System.out.println(Arrays.toString(productList1));

    // Problem 2 (a) using lambda function way.
    Arrays.sort(productList2, (lhs, rhs) -> {
      if (lhs.getPrice() < rhs.getPrice()) {
        return -1;
      } else if (lhs.getPrice() > rhs.getPrice()) {
        return 1;
      }
      return 0;
    });
    System.out.println(Arrays.toString(productList2));

    // Problem 2 (b) using TitleComparator outside the class.
    Arrays.sort(productList3, new TitleComparator());
    System.out.println(Arrays.toString(productList3));

    // Problem 2 (c) using title compartor using lambda function way.
    Arrays.sort(productList4, (lhs, rhs) -> lhs.getTitle().compareTo(rhs.getTitle()));
    System.out.println(Arrays.toString(productList4));
  }
}
