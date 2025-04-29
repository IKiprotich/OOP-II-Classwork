package codingchallenges;

import java.util.Random;

public class DiceGameAndSubscription {

    public static void main(String[] args) {
        Random random = new Random();

        // Dice Game
        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;
        int dice3 = random.nextInt(6) + 1;
        int total = dice1 + dice2 + dice3;

        System.out.println("Dice roll: " + dice1 + " + " + dice2 + " + " + dice3);

        if (dice1 == dice2 && dice2 == dice3) {
            System.out.println("Triples! +6 bonus!");
            total += 6;
        } else if (dice1 == dice2 || dice2 == dice3 || dice1 == dice3) {
            System.out.println("Doubles! +2 bonus!");
            total += 2;
        }

        System.out.println(total >= 15 ? "You win!" : "You lose.");

        // Subscription Reminder
        int daysLeft = random.nextInt(12);
        int discount = daysLeft == 1 ? 20 : (daysLeft <= 5 ? 10 : 0);

        if (daysLeft < 1) {
            System.out.println("Your subscription has expired!");
        } else {
            System.out.println("Your subscription expires in: " + daysLeft + " day(s).");
            if (discount > 0) {
                System.out.println("Renew now and save " + discount + "%!");
            } else if (daysLeft <= 10) {
                System.out.println("Renew soon!");
            }
        }
    }
}
