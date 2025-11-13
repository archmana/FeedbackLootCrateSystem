package models;

public class LootCrate {
    private final String id;
    private final int price;

    public LootCrate(String id, int price) {
        this.id = id;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }
}
