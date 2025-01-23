import java.util.Scanner;

public class ParkingCharges {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalReceipts = 0.0;  // Running total for receipts

        System.out.println("Enter the number of customers who parked yesterday: ");
        int numberOfCustomers = scanner.nextInt();

        for (int i = 1; i <= numberOfCustomers; i++) {
            System.out.printf("Enter hours parked for customer %d: ", i);
            double hoursParked = scanner.nextDouble();

            double charge = calculateCharges(hoursParked);
            totalReceipts += charge;

            System.out.printf("Charge for customer %d: $%.2f%n", i, charge);
        }

        System.out.printf("Total receipts for yesterday: $%.2f%n", totalReceipts);
    }

    // Method to calculate parking charges
    public static double calculateCharges(double hoursParked) {
        double minimumFee = 2.00;
        double additionalFeePerHour = 0.50;
        double maximumFee = 10.00;

        if (hoursParked <= 3) {
            return minimumFee;
        } else {
            double additionalHours = Math.ceil(hoursParked - 3);
            double totalCharge = minimumFee + (additionalHours * additionalFeePerHour);
            return Math.min(totalCharge, maximumFee);
        }
    }
}
