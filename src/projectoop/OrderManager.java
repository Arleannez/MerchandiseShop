package projectoop;

import java.util.List;

public interface OrderManager {
    void processOrder(List<Product> products) throws InsufficientStockException;
}
