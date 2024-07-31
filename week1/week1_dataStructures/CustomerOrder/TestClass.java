package CustomerOrder;

public class TestClass {
    public static void main(String[] args) {
        Order[] orders = {
                new Order("O003", "Alice", 250.75),
                new Order("O001", "Bob", 120.50),
                new Order("O002", "Charlie", 450.25)
        };

        // Display original orders
        System.out.println("Original Orders:");
        displayOrders(orders);
        System.out.println();

        // Bubble Sort
        SortingAlgorithms.bubbleSort(orders);
        System.out.println("Orders after Bubble Sort:");
        displayOrders(orders);
        System.out.println();

        // Reset orders
        orders = new Order[] {
                new Order("O003", "Alice", 250.75),
                new Order("O001", "Bob", 120.50),
                new Order("O002", "Charlie", 450.25)
        };

        // Quick Sort
        SortingAlgorithms.quickSort(orders, 0, orders.length - 1);
        System.out.println("Orders after Quick Sort:");
        displayOrders(orders);
    }

    private static void displayOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
