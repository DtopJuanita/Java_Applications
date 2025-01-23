mport java.util.Random;
import java.util.Scanner;

public class CoinTossing {

    // Enum to represent the two sides of the coin
    public enum Coin {
        HEADS, TAILS
    }

    // Method to simulate a coin flip
    public static Coin flip() {
        Random random = new Random();
        // Randomly return HEADS or TAILS
        return random.nextBoolean() ? Coin.HEADS : Coin.TAILS;
    }

    // Main method with a simple menu to toss the coin
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables to count the number of heads and tails
        int headsCount = 0;
        int tailsCount = 0;

        while (true) {
            // Display the menu
            System.out.println("\nCoin Tossing Application");
            System.out.println("1. Toss Coin");
            System.out.println("2. Exit");
            System.out.print("Choose an option (1 or 2): ");
            int choice = scanner.nextInt();

            // Handle user choices
            if (choice == 1) {
                // Simulate a coin flip and count the results
                Coin result = flip();
                if (result == Coin.HEADS) {
                    headsCount++;
                } else {
                    tailsCount++;
                }
                System.out.println("Result of the toss: " + result);
                System.out.println("Heads: " + headsCount + ", Tails: " + tailsCount);
            } else if (choice == 2) {
                // Exit the program
                System.out.println("Exiting the Coin Tossing Application.");
                break;
            } else {
                System.out.println("Invalid option. Please select 1 or 2.");
            }
        }

        scanner.close();
    }
}