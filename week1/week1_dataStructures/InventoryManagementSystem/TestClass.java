package InventoryManagementSystem;

public class TestClass {
    public static void main(String[] args) {
        InventoryManager inventoryManager = new InventoryManager();
        Product product1 = new Product("P1", "Laptop", 10, 999.99);
        Product product2 = new Product("P2", "Smartphone", 25, 499.99);

        inventoryManager.addProduct(product1);
        inventoryManager.addProduct(product2);

        inventoryManager.displayAllProducts();

        Product updatedProduct = new Product("P2", "Smartphone", 20, 450.00);
        inventoryManager.updateProduct("P2", updatedProduct);
        inventoryManager.displayAllProducts();
        inventoryManager.deleteProduct("P1");
        inventoryManager.displayAllProducts();
    }
}
