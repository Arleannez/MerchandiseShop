package projectoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for Fandom details
        System.out.println("\n**** FANDOM DETAILS ***");
        System.out.print("Enter Fandom name: ");
        String fandomName = scanner.nextLine();

        System.out.print("Enter Fandom description: ");
        String fandomDescription = scanner.nextLine();

        Fandom userFandom = new Fandom(fandomName, fandomDescription);

        // Prompt user for Product details
        System.out.println("\n**** PRODUCT DETAILS ***");
        System.out.print("Enter Product name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter Product description: ");
        String productDescription = scanner.nextLine();

        System.out.print("Enter Product price: ");
        double productPrice = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        Product userProduct = new Product(fandomName, fandomDescription, productName, productDescription, productPrice, 5);

        // Prompt user for Customer details
        System.out.println("\n**** CUSTOMER DETAILS ***");
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter customer email: ");
        String customerEmail = scanner.nextLine();

        System.out.print("Enter customer address: ");
        String customerAddress = scanner.nextLine();

        // Create a sample customer
        Customer customer = new RegularCustomer(customerName, customerEmail, customerAddress);

        // Create a list of products with initial stock
        List<Product> products = new ArrayList<>();
        products.add(new Product(fandomName, fandomDescription, productName, productDescription, productPrice, 5));

        // Display information to the user
        System.out.println("\nWelcome to the Fandom Merchandise Shop!");
        System.out.println("Fandom: " + userFandom.getName());
        System.out.println("Product: " + userProduct.getProductName());
        System.out.println("Price: " + userProduct.getPriceWithCurrency());
        
        // Simulate user interaction for placing an order
        try {
            System.out.println("\nDo you want to place an order? (yes/no)");
            String response = scanner.nextLine().toLowerCase();

            if (response.equals("yes")) {
                try {
                    customer.placeOrder(products);
                    // The following line will be reached if no exception occurs
                    System.out.println("Order placed successfully!");
                } catch (InsufficientStockException e) {
                    ExceptionHandler.handleException(e);
                }
            } else {
                System.out.println("Thank you for visiting. Goodbye!");
            }
        } finally {
            scanner.close(); // Close the scanner to avoid resource leak
        }
    }
}
