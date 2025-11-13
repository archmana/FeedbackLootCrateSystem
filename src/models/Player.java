package models;

import exceptions.NotEnoughCreditException;

public class Player {
    private final String username;
    private int credits;

    public Player(String username, int initialCredit) {
        this.username = username;
        this.credits = initialCredit;
    }

    public void addCredit(int amount) {
        if (amount < 0) {
            throw new exceptions.NegativeAmountException();
        }
        credits += amount;
    }

    public void openLootCrate(LootCrate crate) throws exceptions.NotEnoughCreditException {
        if (credits < crate.getPrice()) {
            throw new NotEnoughCreditException();
        }
        credits -= crate.getPrice();
        System.out.println(username + " opened a crate with ID: " + crate.getId());
    }

    @Override
    public String toString() {
        return "Player: " + username + ", Credits: " + credits;
    }
}
