import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants for rates
        final double RATE_0_50 = 0.50;  // Rate for first 50 units
        final double RATE_51_100 = 0.75;  // Rate for next 50 units
        final double RATE_101_200 = 1.20;  // Rate for units above 100 up to 200
        final double RATE_ABOVE_200 = 1.50;  // Rate for units above 200

        // Input the units consumed
        System.out.print("Enter the number of units consumed: ");
        int unitsConsumed = scanner.nextInt();

        // Calculate electricity bill based on units consumed
        double totalBill = 0;

        if (unitsConsumed > 0) {
            if (unitsConsumed <= 50) {
                totalBill = unitsConsumed * RATE_0_50;
            } else if (unitsConsumed <= 100) {
                totalBill = 50 * RATE_0_50 + (unitsConsumed - 50) * RATE_51_100;
            } else if (unitsConsumed <= 200) {
                totalBill = 50 * RATE_0_50 + 50 * RATE_51_100 + (unitsConsumed - 100) * RATE_101_200;
            } else {
                totalBill = 50 * RATE_0_50 + 50 * RATE_51_100 + 100 * RATE_101_200 + (unitsConsumed - 200) * RATE_ABOVE_200;
            }

            // Display the total bill
            System.out.println("Total electricity bill: $" + totalBill);
        } else {
            System.out.println("Invalid input. Units consumed should be greater than 0.");
        }

        scanner.close();
    }
}
