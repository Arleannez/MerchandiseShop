package projectoop;

import java.util.List;

public abstract class Customer {
    private String name;
    private String email;
    private String address;

    public Customer(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    // Getter methods for customer details
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    // Abstract method for placing an order
    public abstract void placeOrder(List<Product> products) throws InsufficientStockException;
}

