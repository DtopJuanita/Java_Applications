import java.util.Scanner;

public class SquareOfChar {

    // Method to display a square of any character
    public static void squareOfCharacter(int side, char fillCharacter) {
        for (int i = 1; i <= side; i++) { // Loop for rows
            for (int j = 1; j <= side; j++) { // Loop for columns
                System.out.print(fillCharacter); // Print the fill character
            }
            System.out.println(); // Move to the next line
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the size of the square
        System.out.print("Enter the size of the square (side): ");
        int side = input.nextInt();

        // Validate the input
        if (side <= 0) {
            System.out.println("Side length must be a positive integer.");
            return;
        }

        // Input the fill character
        System.out.print("Enter the fill character: ");
        char fill = input.next().charAt(0);

        // Call the method to display the square
        squareOfCharacter(side, fill);

        input.close();
    }
}