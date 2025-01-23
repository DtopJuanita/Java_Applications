import java.util.Scanner;

public class DigitSeparator {

    // Method to calculate the integer part of the quotient
    public static int integerPartOfQuotient(int a, int b) {
        return a / b;
    }

    // Method to calculate the integer remainder
    public static int integerRemainder(int a, int b) {
        return a % b;
    }

    // Method to display digits with two spaces between each pair
    public static void displayDigits(int n) {
        int numberOfDigits = (int) Math.log10(n) + 1;  // Calculate number of digits
        int[] digits = new int[numberOfDigits];

        // Extract digits into an array
        for (int i = numberOfDigits - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n = integerPartOfQuotient(n, 10);
        }

        // Print digits with two spaces in between
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
            if (i < digits.length - 1) {
                System.out.print("  ");
            }
        }
        System.out.println();  // Newline after printing all digits
    }

    // Main method to input the number and display the result
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer between 1 and 99999: ");
        int number = scanner.nextInt();
        
        if (number >= 1 && number <= 99999) {
            displayDigits(number);
        } else {
            System.out.println("Please enter a valid number between 1 and 99999.");
        }

        scanner.close();
    }
}