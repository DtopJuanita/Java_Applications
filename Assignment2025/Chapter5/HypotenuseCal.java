import java.util.Scanner;

public class HypotenuseCal {

    // Method to calculate the hypotenuse using the Pythagorean theorem
    public static double hypotenuse(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example triangles from Fig. 5.14
        double[][] triangles = {
            {3.0, 4.0},
            {5.0, 12.0},
            {8.0, 15.0}
        };

        System.out.println("Hypotenuse Calculations:");
        for (int i = 0; i < triangles.length; i++) {
            double side1 = triangles[i][0];
            double side2 = triangles[i][1];
            double result = hypotenuse(side1, side2);
            System.out.printf("Triangle %d (Side1: %.1f, Side2: %.1f) -> Hypotenuse: %.2f%n", 
                              i + 1, side1, side2, result);
        }

        // Additional user input for custom triangle sides
        System.out.print("\nEnter Side 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter Side 2: ");
        double side2 = scanner.nextDouble();

        double customHypotenuse = hypotenuse(side1, side2);
        System.out.printf("For sides %.1f and %.1f, the hypotenuse is: %.2f%n", 
                          side1, side2, customHypotenuse);

        scanner.close();
    }
}