package projectoop;

public class Fandom {
    private String name;
    private String description;

    public Fandom(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Getter methods for encapsulation
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
