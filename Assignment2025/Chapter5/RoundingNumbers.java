import java.util.Scanner;

public class RoundingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers to round (type 'done' to finish):");

        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                double originalNumber = scanner.nextDouble();
                long roundedNumber = roundToNearestInteger(originalNumber);

                System.out.printf("Original number: %.2f, Rounded number: %d%n", originalNumber, roundedNumber);
            } else if (scanner.hasNext("done")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a number or type 'done' to finish.");
                scanner.next(); // Clear the invalid input
            }
        }

        System.out.println("Program ended. Thank you!");
    }

    // Method to round a number to the nearest integer using Math.floor
    public static long roundToNearestInteger(double number) {
        return (long) Math.floor(number + 0.5);
    }
}
