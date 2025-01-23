import java.util.Scanner;

public class AreaOfCircle {

    // Method to calculate the area of a circle
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Validate input
        if (radius < 0) {
            System.out.println("Radius cannot be negative.");
        } else {
            // Calculate and display the area
            double area = circleArea(radius);
            System.out.printf("The area of the circle is: %.2f%n", area);
        }

        scanner.close();
    }
}