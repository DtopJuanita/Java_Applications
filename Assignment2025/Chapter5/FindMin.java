import java.util.Scanner;

public class FindMin {

    // Method to find the smallest of three floating-point numbers
    public static double minimum3(double num1, double num2, double num3) {
        return Math.min(Math.min(num1, num2), num3);
    }

    // Main method to read input from the user and display the result
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three floating-point numbers from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Determine the smallest number
        double smallest = minimum3(num1, num2, num3);
        
        // Display the result
        System.out.println("The smallest number is: " + smallest);

        scanner.close();
    }
}