import java.util.Scanner;

public class IntegerPower {

    // Method to calculate base^exponent
    public static int integerPower(int base, int exponent) {
        int result = 1;

        // Loop to multiply the base 'exponent' times
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input base and exponent from user
        System.out.print("Enter the base (integer): ");
        int base = scanner.nextInt();

        System.out.print("Enter the exponent (positive integer): ");
        int exponent = scanner.nextInt();

        // Validate the exponent is positive
        if (exponent <= 0) {
            System.out.println("Exponent must be a positive, nonzero integer.");
        } else {
            // Call the method and display the result
            int result = integerPower(base, exponent);
            System.out.println(base + "^" + exponent + " = " + result);
        }

        scanner.close();
    }
}