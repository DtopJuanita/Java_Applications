import java.util.Scanner;

public class Multiples {

    // Method to determine if the second integer is a multiple of the first
    public static boolean isMultiple(int first, int second) {
        return second % first == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter pairs of integers (first and second). Enter 0 for the first integer to exit.");

        while (true) {
            // Input integers from the user
            System.out.print("\nEnter the first integer: ");
            int first = scanner.nextInt();

            if (first == 0) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter the second integer: ");
            int second = scanner.nextInt();

            // Check if second is a multiple of first
            if (isMultiple(first, second)) {
                System.out.println(second + " is a multiple of " + first);
            } else {
                System.out.println(second + " is not a multiple of " + first);
            }
        }

        scanner.close();
    }
}