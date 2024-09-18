

import java.util.Arrays;

public class ProductInfo {
    /**
     * This is for Problem 2 (c) using interface implementation way.
     */
    public void sort(Product[] list, SortMethod method) {
        Arrays.sort(list, new ProductComparator(method));
    }

    /**
     * This is for Problem 2 (c) using lambda function way.
     */
    public void lambdasort(Product[] list, SortMethod method) {
        if (SortMethod.BY_PRICE == method) {
            Arrays.sort(list, (lhs, rhs) -> {
                if (lhs.getPrice() < rhs.getPrice()) {
                    return -1;
                } else if (lhs.getPrice() > rhs.getPrice()) {
                    return 1;
                }
                return 0;
            });
        }
    }

    /**
     * This is for Problem 2 (d)
     */
    public void sortByTitleAndPrice(Product[] list) {
        Arrays.sort(list, (lhs, rhs) -> {
            if (lhs.getTitle().equals(rhs.getTitle())) {
                if (lhs.getPrice() < rhs.getPrice()) {
                    return -1;
                } else if (lhs.getPrice() > rhs.getPrice()) {
                    return 1;
                }
                return 0;
            }
            return lhs.getTitle().compareTo(rhs.getTitle());
        });
    }

    public static void main(String[] args) {
        Product[] productList1 = { new Product("C", 100.0d, 9), new Product("B", 20.0d, 8), new Product("A", 120d, 1) };
        Product[] productList2 = new Product[productList1.length];
        Product[] productList3 = new Product[productList1.length];

        System.arraycopy(productList1, 0, productList2, 0, productList1.length);
        System.arraycopy(productList1, 0, productList3, 0, productList1.length);
        ProductInfo pi = new ProductInfo();
        pi.sort(productList1, SortMethod.BY_PRICE);
        System.out.println(Arrays.toString(productList1));
        pi.sort(productList2, SortMethod.BY_TITLE);
        System.out.println(Arrays.toString(productList2));

        pi.lambdasort(productList2, SortMethod.BY_PRICE);
        System.out.println(Arrays.toString(productList2));
        pi.lambdasort(productList2, SortMethod.BY_TITLE);
        System.out.println(Arrays.toString(productList2));

        pi.sortByTitleAndPrice(productList3);
        System.out.println(Arrays.toString(productList3));
    }
}
