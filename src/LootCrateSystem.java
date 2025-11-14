import exceptions.PlayerNotFoundException;
import models.LootCrate;
import models.Player;

public class LootCrateSystem {
    public static void main(String[] args) {
        // instanser af player objekter
        try {
            Player player1 = new Player("player1", 100);
            Player player2 = new Player("player2", 50);
        // instanser af lootcrate objekter
            LootCrate crate1 = new LootCrate("crate1", 30);
            LootCrate crate2 = new LootCrate("crate2", 70);

            // test af player 1 og lootcrate 1
            System.out.println(player1);
            player1.openLootCrate(crate1);
            System.out.println(player1);

            // test af player 2 og lootcrate 2
            // exception handtering:
            System.out.println(player2);
            // player 2 prøver at åbne en lootcrate han ikke har nok credits til
            try {
                player2.openLootCrate(crate2);
            } catch (exceptions.NotEnoughCreditException e) {
                System.out.println("---ERROR--- " + e.getMessage());
            }

            // tilføjer negative credits til player 2
            try {
                player1.addCredit(-10);
            } catch (exceptions.NegativeAmountException e) {
                System.out.println("---ERROR--- " + e.getMessage());
            }

            // prøver at finde en player der ikke eksisterer
            try {
                findPlayer("Player3");
            } catch (exceptions.PlayerNotFoundException e) {
                System.out.println("---ERROR--- " + e.getMessage());
            }

            // hvis der sker en uventet fejl
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }

    // metode til at finde en player baseret på username
    public static Player findPlayer(String username) throws exceptions.PlayerNotFoundException {
        if ("Player1".equals(username)) {
            return new Player("Player1", 100);
        } else {
            throw new PlayerNotFoundException();
        }
    }
}