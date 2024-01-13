package projectoop;

import java.util.List;

public class RegularCustomer extends Customer {
    public RegularCustomer(String name, String email, String address) {
        super(name, email, address);
    }

@Override
public void placeOrder(List<Product> products) {
    // Simulate order processing logic
    System.out.println("Processing order for customer: " + getName());

    boolean orderPlacedSuccessfully = true;

    for (Product product : products) {
        try {
            // Check product availability and update stock
            if (product.isAvailable()) {
                System.out.println("Product available: " + product.getProductName());
                // Simulate placing an order by updating the stock
                product.updateStock(1);
            } else {
                orderPlacedSuccessfully = false;
                throw new InsufficientStockException("Sorry, the product is out of stock!");
            }
        } catch (InsufficientStockException e) {
            ExceptionHandler.handleException(e);
        }
    }
}




