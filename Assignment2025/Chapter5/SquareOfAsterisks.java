import java.util.Scanner;

public class SquareOfAsterisks {

    // Method to display a solid square of asterisks
    public static void squareOfAsterisks(int side) {
        for (int i = 1; i <= side; i++) { // Loop for rows
            for (int j = 1; j <= side; j++) { // Loop for columns
                System.out.print("* "); // Print asterisk with space
            }
            System.out.println(); // Move to the next line
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the square
        System.out.print("Enter the size of the square (side): ");
        int side = scanner.nextInt();

        // Validate input
        if (side <= 0) {
            System.out.println("Side length must be a positive integer.");
        } else {
            // Call the method to display the square
            squareOfAsterisks(side);
        }

        scanner.close();
    }
}