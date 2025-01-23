import java.util.Scanner;

public class GCD {

    // Method to compute the greatest common divisor using Euclid's algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;  // Find remainder
            a = temp;   // Set a to b
        }
        return a;  // When b becomes 0, a is the GCD
    }

    // Main method to read input and display the result
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integers from the user
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Compute and display the GCD
        int result = gcd(num1, num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + result);

        scanner.close();
    }
}