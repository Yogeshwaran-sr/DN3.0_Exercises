package EPlatFormSearch;

import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
        Product[] products = {
                new Product("P003", "Tablet", "Electronics"),
                new Product("P001", "Laptop", "Electronics"),
                new Product("P002", "Smartphone", "Electronics")
        };

        Arrays.sort(products, (p1, p2) -> p1.getProductId().compareTo(p2.getProductId()));

        System.out.println("Testing Linear Search:");
        Product result = SearchAlgorithms.linearSearch(products, "P002");
        if (result != null) {
            System.out.println("Found: " + result);
        } else {
            System.out.println("Product not found.");
        }
        System.out.println();

        System.out.println("Testing Binary Search:");
        result = SearchAlgorithms.binarySearch(products, "P002");
        if (result != null) {
            System.out.println("Found: " + result);
        } else {
            System.out.println("Product not found.");
        }
    }
}
