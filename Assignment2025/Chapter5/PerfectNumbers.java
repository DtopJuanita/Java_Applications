public class PerfectNumbers {

    // Method to check if a number is perfect
    public static boolean isPerfect(int number) {
        int sum = 0;

        // Find factors of the number and sum them (excluding the number itself)
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Return true if the sum of factors equals the number
        return sum == number;
    }

    // Method to display factors of a perfect number
    public static void displayFactors(int number) {
        System.out.print("Factors of " + number + ": 1");
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.print(" + " + i);
            }
        }
        System.out.println();
    }

    // Main method to display all perfect numbers between 1 and 1000
    public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 and 1000:");

        // Loop through numbers 1 to 1000 and check if they are perfect
        for (int i = 1; i <= 1000; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " is a perfect number. ");
                displayFactors(i);
            }
        }
    }
}