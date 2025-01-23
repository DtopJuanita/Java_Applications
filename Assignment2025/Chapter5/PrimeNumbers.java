public class PrimeNumbers {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 1 and numbers less than 1 are not prime
        }

        // Check divisibility up to the square root of the number
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false; // number is divisible by i, hence not prime
            }
        }
        return true; // number is prime
    }

    // Main method to display all prime numbers less than 10,000
    public static void main(String[] args) {
        int limit = 10000;
        int count = 0;

        System.out.println("Prime numbers less than " + limit + ":");

        // Loop through numbers from 2 to 9999 and check if they are prime
        for (int i = 2; i < limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nTotal prime numbers less than " + limit + ": " + count);
    }
}