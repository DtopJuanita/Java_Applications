import java.util.Scanner;

public class NumberRounding {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers to round (type 'done' to finish):");

        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                double number = scanner.nextDouble();

                // Display the results
                System.out.printf("Original number: %.5f%n", number);
                System.out.printf("Rounded to nearest integer: %d%n", roundToInteger(number));
                System.out.printf("Rounded to nearest tenth: %.1f%n", roundToTenths(number));
                System.out.printf("Rounded to nearest hundredth: %.2f%n", roundToHundredths(number));
                System.out.printf("Rounded to nearest thousandth: %.3f%n", roundToThousandths(number));
                System.out.println(); // Blank line for readability
            } else if (scanner.hasNext("done")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a number or type 'done' to finish.");
                scanner.next(); // Clear the invalid input
            }
        }

        System.out.println("Program ended. Thank you!");
    }

    // Method to round to the nearest integer
    public static long roundToInteger(double number) {
        return (long) Math.floor(number + 0.5);
    }

    // Method to round to the nearest tenth
    public static double roundToTenths(double number) {
        return Math.floor(number * 10 + 0.5) / 10;
    }

    // Method to round to the nearest hundredth
    public static double roundToHundredths(double number) {
        return Math.floor(number * 100 + 0.5) / 100;
    }

    // Method to round to the nearest thousandth
    public static double roundToThousandths(double number) {
        return Math.floor(number * 1000 + 0.5) / 1000;
    }
}
