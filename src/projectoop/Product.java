package projectoop;

public class Product extends Fandom {
    private String productName;
    private String productDescription;
    private double price;
    private int stock;  // New attribute for stock quantity
    private String currency;

    public Product(String name, String description, String productName, String productDescription, double price, int stock) {
        super(name, description);
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
        this.stock = stock;
        this.currency = "PHP";  // Set the currency to PHP by default
    }

    // Getter methods for product details
    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public String getCurrency() {
        return currency;
    }

    public String getPriceWithCurrency() {
        return currency + " " + price;
    }

    // Method to check if a product is available
    public boolean isAvailable() {
        return stock > 0;
    }

    // Method to update the stock quantity after an order is placed
    public void updateStock(int quantity) {
        stock = Math.max(0, stock - quantity);
    }
}
