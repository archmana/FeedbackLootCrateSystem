import exceptions.PlayerNotFoundException;
import models.LootCrate;
import models.Player;

public class LootCrateSystem {
    public static void main(String[] args) {
        try {
            Player player1 = new Player("player1", 100);
            Player player2 = new Player("player2", 50);

            LootCrate crate1 = new LootCrate("crate1", 30);
            LootCrate crate2 = new LootCrate("crate2", 70);

            System.out.println(player1);
            player1.openLootCrate(crate1);
            System.out.println(player1);

            System.out.println(player2);
            try {
                player2.openLootCrate(crate2);
            } catch (exceptions.NotEnoughCreditException e) {
                System.out.println("---ERROR--- " + e.getMessage());
            }

            try {
                player1.addCredit(-10);
            } catch (exceptions.NegativeAmountException e) {
                System.out.println("---ERROR--- " + e.getMessage());
            }

            try {
                findPlayer("Player3");
            } catch (exceptions.PlayerNotFoundException e) {
                System.out.println("---ERROR--- " + e.getMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }

    public static Player findPlayer(String username) throws exceptions.PlayerNotFoundException {
        if ("Player1".equals(username)) {
            return new Player("Player1", 100);
        } else {
            throw new PlayerNotFoundException();
        }
    }
}