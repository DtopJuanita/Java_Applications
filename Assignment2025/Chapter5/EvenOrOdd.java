import java.util.Scanner;

public class EvenOrOdd {

    // Method to determine if an integer is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers to check if they are even or odd. Enter 0 to exit.");

        while (true) {
            // Input an integer
            System.out.print("\nEnter an integer: ");
            int number = scanner.nextInt();

            // Exit the loop if 0 is entered
            if (number == 0) {
                System.out.println("Exiting...");
                break;
            }

            // Determine if the number is even or odd
            if (isEven(number)) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
        }

        scanner.close();
    }
}