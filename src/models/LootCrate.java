package models;

public class LootCrate {
    // id, price kan ikke ændres efter oprettelse
    private final String id;
    private final int price;

    // konstruktør til at initialisere id og price
    public LootCrate(String id, int price) {
        this.id = id;
        this.price = price;
    }

    // getters for id og price
    public String getId() {
        return id;
    }
    public int getPrice() {
        return price;
    }
}
