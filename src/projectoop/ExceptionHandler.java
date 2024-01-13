package projectoop;

public class ExceptionHandler {
    public static void handleException(Exception e) {
        if (e instanceof InsufficientStockException) {
            System.err.println("Insufficient Stock Error: " + e.getMessage());
        } else if (e instanceof IllegalArgumentException) {
            System.err.println("Illegal Argument Error: " + e.getMessage());
        } else {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}

