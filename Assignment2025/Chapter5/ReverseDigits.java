import java.util.Scanner;

public class ReverseDigits {

    // Method to reverse the digits of a given integer
    public static int reverseDigits(int number) {
        int reversed = 0;

        // Loop through the number and reverse its digits
        while (number != 0) {
            int digit = number % 10;          // Get the last digit
            reversed = reversed * 10 + digit; // Append the digit to reversed number
            number /= 10;                     // Remove the last digit from the original number
        }

        return reversed;
    }

    // Main method to read input from the user and display the reversed number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read an integer value from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Reverse the digits and display the result
        int reversedNumber = reverseDigits(number);
        System.out.println("Reversed number: " + reversedNumber);

        scanner.close();
    }
}