import java.util.Scanner;

public class QualityPoints {

    // Method to determine quality points based on the average score
    public static int qualityPoints(double average) {
        if (average >= 90 && average <= 100) {
            return 4; // 90–100
        } else if (average >= 80 && average < 90) {
            return 3; // 80–89
        } else if (average >= 70 && average < 80) {
            return 2; // 70–79
        } else if (average >= 60 && average < 70) {
            return 1; // 60–69
        } else {
            return 0; // Below 60
        }
    }

    // Main method to read the average score and display the quality points
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the student's average score
        System.out.print("Enter the student's average score: ");
        double average = scanner.nextDouble();

        // Get the quality points
        int points = qualityPoints(average);

        // Display the quality points
        System.out.println("Quality points for an average score of " + average + ": " + points);

        scanner.close();
    }
}